package com.cst8277.Elms.Victoria;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="/subscription")
public class Subscription {
    @Id
    Integer subscriptionid;
    Integer subscriberid;
    Integer producerid;

}
