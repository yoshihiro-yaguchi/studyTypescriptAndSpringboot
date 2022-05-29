package com.rol.back.blogSummary;

import java.util.List;

import com.rol.back.blogSummary.bean.api.ApiDoInitReturns;
import com.rol.back.blogSummary.bean.repository.SelectTrold301Returns;
import com.rol.back.blogSummary.repository.BlogRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BlogService {

  private BlogRepository repository;

  public ApiDoInitReturns init() throws Exception {
    List<SelectTrold301Returns> result = repository.selectTrold301();

    ApiDoInitReturns returnData = new ApiDoInitReturns();
    returnData.setResult(result);
    System.out.println(returnData);

    return returnData;
  }
}
