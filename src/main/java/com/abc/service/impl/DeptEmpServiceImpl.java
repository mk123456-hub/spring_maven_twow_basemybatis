package com.abc.service.impl;

import com.abc.common.Comm;
import com.abc.common.Res;
import com.abc.common.ResEnum;
import com.abc.controller.vo.DeptEmpVO;
import com.abc.dao.idao.IReportDao;
import com.abc.service.dto.DeptEmpDTO;
import com.abc.service.iservice.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Administrator
 * @create 2020/12/7 0007 21:22
 */
@Service("deptempService")
public class DeptEmpServiceImpl implements IReportService {
    @Autowired
    IReportDao reportDao;

    @Override
    public Res<List<DeptEmpDTO>> makeReportForDeptEmp(DeptEmpVO deptEmpVO) {
        List<DeptEmpDTO> result=null;
        try {
            result=reportDao.makeReportForDeptEmp(deptEmpVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (result!=null&&result.size()>0)?Res.success(ResEnum.SUCCESS,result):Res.error();
    }
}
