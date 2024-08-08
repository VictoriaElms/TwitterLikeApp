package com.cst8277.Elms.Victoria;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.sql.Date;


@Data
@NoArgsConstructor
@Entity
@Table(name= "message")
public class Messages {
    @Id
    Integer messageid;
    String content;
    Date createdate;
    Integer userid;

}
