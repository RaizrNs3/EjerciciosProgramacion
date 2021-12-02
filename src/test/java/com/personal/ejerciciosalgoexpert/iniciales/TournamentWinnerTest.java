package com.personal.ejerciciosalgoexpert.iniciales;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TournamentWinnerTest {
    @Test
    public void TestCase1() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 1));
        String expected = "Python";
        String actual = TournamentWinner.tournamentWinner(competitions, results);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase2() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("HTML", "Java"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("Java", "Python"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 1, 1));
        String expected = "Java";
        String actual = TournamentWinner.tournamentWinner(competitions, results);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase3() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("HTML", "Java"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("Java", "Python"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        ArrayList<String> competition4 = new ArrayList<>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition5 = new ArrayList<>(Arrays.asList("Java", "C#"));
        ArrayList<String> competition6 = new ArrayList<>(Arrays.asList("C#", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        competitions.add(competition4);
        competitions.add(competition5);
        competitions.add(competition6);
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 1, 1, 1, 0, 1));
        String expected = "C#";
        String actual = TournamentWinner.tournamentWinner(competitions, results);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase4() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("HTML", "Java"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("Java", "Python"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        ArrayList<String> competition4 = new ArrayList<>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition5 = new ArrayList<>(Arrays.asList("Java", "C#"));
        ArrayList<String> competition6 = new ArrayList<>(Arrays.asList("C#", "HTML"));
        ArrayList<String> competition7 = new ArrayList<>(Arrays.asList("SQL", "C#"));
        ArrayList<String> competition8 = new ArrayList<>(Arrays.asList("HTML", "SQL"));
        ArrayList<String> competition9 = new ArrayList<>(Arrays.asList("SQL", "Python"));
        ArrayList<String> competition10 = new ArrayList<>(Arrays.asList("SQL", "Java"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        competitions.add(competition4);
        competitions.add(competition5);
        competitions.add(competition6);
        competitions.add(competition7);
        competitions.add(competition8);
        competitions.add(competition9);
        competitions.add(competition10);
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 1, 1, 1, 0, 1, 0, 1, 1, 0));
        String expected = "C#";
        String actual = TournamentWinner.tournamentWinner(competitions, results);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase5() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("Bulls", "Eagles"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("Bulls", "Bears"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Bears", "Eagles"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 0));
        String expected = "Eagles";
        String actual = TournamentWinner.tournamentWinner(competitions, results);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase6() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("Bulls", "Eagles"));
        competitions.add(competition1);
        ArrayList<Integer> results = new ArrayList<>(List.of(1));
        String expected = "Bulls";
        String actual = TournamentWinner.tournamentWinner(competitions, results);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase7() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("Bulls", "Eagles"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("Bulls", "Bears"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Bulls", "Monkeys"));
        ArrayList<String> competition4 = new ArrayList<>(Arrays.asList("Eagles", "Bears"));
        ArrayList<String> competition5 = new ArrayList<>(Arrays.asList("Eagles", "Monkeys"));
        ArrayList<String> competition6 = new ArrayList<>(Arrays.asList("Bears", "Monkeys"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        competitions.add(competition4);
        competitions.add(competition5);
        competitions.add(competition6);
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1));
        String expected = "Bulls";
        String actual = TournamentWinner.tournamentWinner(competitions, results);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase8() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("AlgoMasters", "FrontPage Freebirds"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("Runtime Terror", "Static Startup"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("WeC#", "Hypertext Assassins"));
        ArrayList<String> competition4 = new ArrayList<>(Arrays.asList("AlgoMasters", "WeC#"));
        ArrayList<String> competition5 = new ArrayList<>(Arrays.asList("Static Startup", "Hypertext Assassins"));
        ArrayList<String> competition6 = new ArrayList<>(Arrays.asList("Runtime Terror", "FrontPage Freebirds"));
        ArrayList<String> competition7 = new ArrayList<>(Arrays.asList("AlgoMasters", "Runtime Terror"));
        ArrayList<String> competition8 = new ArrayList<>(Arrays.asList("Hypertext Assassins", "FrontPage Freebirds"));
        ArrayList<String> competition9 = new ArrayList<>(Arrays.asList("Static Startup", "WeC#"));
        ArrayList<String> competition10 = new ArrayList<>(Arrays.asList("AlgoMasters", "Static Startup"));
        ArrayList<String> competition11 = new ArrayList<>(Arrays.asList("FrontPage Freebirds", "WeC#"));
        ArrayList<String> competition12 = new ArrayList<>(Arrays.asList("Hypertext Assassins", "Runtime Terror"));
        ArrayList<String> competition13 = new ArrayList<>(Arrays.asList("AlgoMasters", "Hypertext Assassins"));
        ArrayList<String> competition14 = new ArrayList<>(Arrays.asList("WeC#", "Runtime Terror"));
        ArrayList<String> competition15 = new ArrayList<>(Arrays.asList("FrontPage Freebirds", "Static Startup"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        competitions.add(competition4);
        competitions.add(competition5);
        competitions.add(competition6);
        competitions.add(competition7);
        competitions.add(competition8);
        competitions.add(competition9);
        competitions.add(competition10);
        competitions.add(competition11);
        competitions.add(competition12);
        competitions.add(competition13);
        competitions.add(competition14);
        competitions.add(competition15);
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0));
        String expected = "AlgoMasters";
        String actual = TournamentWinner.tournamentWinner(competitions, results);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase9() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("HTML", "Java"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("Java", "Python"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        ArrayList<String> competition4 = new ArrayList<>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition5 = new ArrayList<>(Arrays.asList("Java", "C#"));
        ArrayList<String> competition6 = new ArrayList<>(Arrays.asList("C#", "HTML"));
        ArrayList<String> competition7 = new ArrayList<>(Arrays.asList("SQL", "C#"));
        ArrayList<String> competition8 = new ArrayList<>(Arrays.asList("HTML", "SQL"));
        ArrayList<String> competition9 = new ArrayList<>(Arrays.asList("SQL", "Python"));
        ArrayList<String> competition10 = new ArrayList<>(Arrays.asList("SQL", "Java"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        competitions.add(competition4);
        competitions.add(competition5);
        competitions.add(competition6);
        competitions.add(competition7);
        competitions.add(competition8);
        competitions.add(competition9);
        competitions.add(competition10);
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 1, 0, 1, 1));
        String expected = "SQL";
        String actual = TournamentWinner.tournamentWinner(competitions, results);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase10() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("A", "B"));
        competitions.add(competition1);
        ArrayList<Integer> results = new ArrayList<>(List.of(0));
        String expected = "B";
        String actual = TournamentWinner.tournamentWinner(competitions, results);
        assertEquals(expected, actual);
    }
}