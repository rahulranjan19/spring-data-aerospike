package org.springframework.data.aerospike.repository;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class SimpleObject {

    String property1;
    int property2;
}