package com.macro.mall.tiny.modules.ums.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.ums.model.UmsStockTransaction;
import com.macro.mall.tiny.modules.ums.mapper.UmsStockTransactionMapper;
import com.macro.mall.tiny.modules.ums.service.UmsStockTransactionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 股票交割流水表 服务实现类
 * </p>
 *
 * @author macro
 * @since 2020-10-03
 */
@Service
public class UmsStockTransactionServiceImpl extends ServiceImpl<UmsStockTransactionMapper, UmsStockTransaction> implements UmsStockTransactionService {
    @Override
    public Page<UmsStockTransaction> list(String keyword, Integer pageSize, Integer pageNum) {
        Page<UmsStockTransaction> page = new Page<>(pageNum, pageSize);
        QueryWrapper<UmsStockTransaction> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<UmsStockTransaction> lambda = wrapper.lambda();
        if(StrUtil.isNotEmpty(keyword)){
            lambda.like(UmsStockTransaction::getStockCode,keyword);
        }
        return page(page,wrapper);
    }
}
