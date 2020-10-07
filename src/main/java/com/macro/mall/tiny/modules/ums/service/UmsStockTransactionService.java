package com.macro.mall.tiny.modules.ums.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.ums.model.UmsStockTransaction;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 股票交割流水表 服务类
 * </p>
 *
 * @author macro
 * @since 2020-10-03
 */
public interface UmsStockTransactionService extends IService<UmsStockTransaction> {
    Page<UmsStockTransaction> list(String keyword, Integer pageSize, Integer pageNum);
}
