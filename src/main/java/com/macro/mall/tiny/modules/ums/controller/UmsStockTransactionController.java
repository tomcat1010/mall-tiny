package com.macro.mall.tiny.modules.ums.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.common.api.CommonPage;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.ums.model.UmsStockTransaction;
import com.macro.mall.tiny.modules.ums.service.UmsStockTransactionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 股票交割流水表 前端控制器
 * </p>
 *
 * @author macro
 * @since 2020-10-03
 */
@RestController
@RequestMapping("/stock")
public class UmsStockTransactionController {
    @Autowired
    private UmsStockTransactionService stockTransactionService;

    @ApiOperation("根据股票代码分页获取角色列表")
    @RequestMapping(value = "/transaction", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<UmsStockTransaction>> list(@RequestParam(value = "keyword", required = false) String keyword,
                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        Page<UmsStockTransaction> stockTransactionList = stockTransactionService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(stockTransactionList));
    }
}

