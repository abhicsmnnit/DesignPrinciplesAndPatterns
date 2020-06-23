package com.example.patterns.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Leader {
    private final String firstName;
    private final String lastName;
    private final boolean isPresident;
}
