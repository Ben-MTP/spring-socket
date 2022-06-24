package com.jindo.core.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * @author ManhKM on 6/24/2022
 * @project spring-socket
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OutputMessage {

    private String from;
    private String text;
    private String time;
}