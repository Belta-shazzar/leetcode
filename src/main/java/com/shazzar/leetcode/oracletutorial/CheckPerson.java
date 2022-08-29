package com.shazzar.leetcode.oracletutorial;

import static com.shazzar.leetcode.oracletutorial.Person.Sex.*;

public interface CheckPerson {
    boolean test(Person person);
}

class CheckPersonEligibleForSelectiveService implements CheckPerson {

    @Override
    public boolean test(Person person) {
        return person.getGender() == MALE && person.getAge() >= 18 && person.getAge() <= 25;
    }
}
