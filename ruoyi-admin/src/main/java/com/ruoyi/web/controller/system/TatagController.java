package com.ruoyi.web.controller.system;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Tatag;
import com.ruoyi.system.service.ITatagService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

import javax.annotation.Resource;
import java.util.List;

/**
 * 标签Controller
 *
 * @author ruoyi
 * @date 2022-09-18
 */
@Controller
@RequestMapping("/system/tatag")
public class TatagController extends BaseController {
    private String prefix = "system/tatag";

    @Resource
    private ITatagService tatagService;

    @RequiresPermissions("system:tatag:view")
    @GetMapping()
    public String tatag() {
        return prefix + "/tatag";
    }

    /**
     * 查询标签列表
     */
    @RequiresPermissions("system:tatag:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Tatag tatag) {
        startPage();
        List<Tatag> list = tatagService.selectTatagList(tatag);
        return getDataTable(list);
    }

    /**
     * 导出标签列表
     */
    @RequiresPermissions("system:tatag:export")
    @Log(title = "标签", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Tatag tatag) {
        List<Tatag> list = tatagService.selectTatagList(tatag);
        ExcelUtil<Tatag> util = new ExcelUtil<Tatag>(Tatag.class);
        return util.exportExcel(list, "标签数据");
    }

    /**
     * 新增标签
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存标签
     */
    @RequiresPermissions("system:tatag:add")
    @Log(title = "标签", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Tatag tatag) {
        return toAjax(tatagService.insertTatag(tatag));
    }

    /**
     * 修改标签
     */
    @RequiresPermissions("system:tatag:edit")
    @GetMapping("/edit/{tagid}")
    public String edit(@PathVariable("tagid") String tagid, ModelMap mmap) {
        Tatag tatag = tatagService.selectTatagByTagid(tagid);
        mmap.put("tatag", tatag);
        return prefix + "/edit";
    }

    /**
     * 修改保存标签
     */
    @RequiresPermissions("system:tatag:edit")
    @Log(title = "标签", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Tatag tatag) {
        return toAjax(tatagService.updateTatag(tatag));
    }

    /**
     * 删除标签
     */
    @RequiresPermissions("system:tatag:remove")
    @Log(title = "标签", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tatagService.deleteTatagByTagids(ids));
    }
}
