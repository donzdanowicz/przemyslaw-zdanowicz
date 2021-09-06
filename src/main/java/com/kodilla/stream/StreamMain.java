package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.Period;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> result = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == ('M'))
                .filter(forumUser -> forumUser.calculatePeriod() > 20)
                .filter(forumUser -> forumUser.getPostsCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));


        System.out.println(result);





       /* BookDirectory theBookDirectory = new BookDirectory();

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);
        */
        /*
        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
        */


        /* BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);
        */

        /* theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);
        */

        /* 7.3 cascade stream
        People.getList().stream()
            .map(s -> s.toUpperCase()) //String::toUpperCase
            .filter(s -> s.length() > 11)
            .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
            .filter(s -> s.substring(0, 1).equals("M"))
            .forEach(System.out::println); //s -> System.out.println(s);

*/


/* 7.1
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subAFromB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("\nBeautifying strings.");
        poemBeautifier.beautify("Never Give up!",(string) -> "ABC." + string + ".ABC");
        poemBeautifier.beautify("Don't Worry, Be Happy", (string) -> string.toUpperCase());
        poemBeautifier.beautify("Once upon a midnight dreary, while I pondered, weak and weary,",
                (string) -> "*** " + string + " ***");
        poemBeautifier.beautify("Over many a quaint and curious volume of forgotten lore -", (string) -> string + " :)");
        poemBeautifier.beautify("While I nodded, nearly napping, suddenly there came a tapping,", (string) -> "..." + string + "...");
        poemBeautifier.beautify("As of some one gently rapping, rapping at my chamber door.", (string) -> "_ " + string + " _");

7.2
        System.out.println("\nUsing stream to generate even numbers from 1 to 20:");
        NumbersGenerator.generateEven(20);
*/
    }
}
