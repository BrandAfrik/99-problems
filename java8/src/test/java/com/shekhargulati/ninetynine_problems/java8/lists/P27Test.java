package com.shekhargulati.ninetynine_problems.java8.lists;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

public class P27Test {

    @Test
    public void shouldGroupIntoThreeGroupsOfSize_2_3_and_4() throws Exception {
        List<String> input = Stream.of("aldo", "beat", "carla", "david", "evi", "flip", "gary", "hugo", "ida").collect(toList());
        List<List<List<String>>> groups = P27.group3(input);
        assertThat(groups, hasSize(1260));
    }

    @Test
    public void shouldGroupIntoThreeGroupsOfSize_1_and_2_part2() throws Exception {
        List<String> input = Stream.of("a", "b", "c", "d").collect(toList());
        List<List<String>> groups = P27.group(input, Stream.of(2, 2).collect(Collectors.toList()));

        System.out.println(groups);
        assertThat(groups, hasSize(3));
    }


    @Test
    public void shouldGroupIntoThreeGroupsOfSize_2_3_and_4_part2() throws Exception {
        List<String> input = Stream.of("aldo", "beat", "carla", "david", "evi", "flip", "gary", "hugo", "ida").collect(toList());
        List<List<String>> groups = P27.group(input, Stream.of(2, 3, 4).collect(Collectors.toList()));
        groups.forEach(g -> System.out.println(g.size()));
        assertThat(groups, hasSize(1260));
    }
}