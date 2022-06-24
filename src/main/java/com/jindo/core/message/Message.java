package com.jindo.core.message;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * @author ManhKM on 6/24/2022
 * @project spring-socket
 */
@NoArgsConstructor
@Getter
@Setter
public class Message {

    private String from;
    private String text;

}
