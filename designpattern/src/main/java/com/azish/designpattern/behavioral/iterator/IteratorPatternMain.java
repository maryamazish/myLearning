//https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm

package com.azish.designpattern.behavioral.iterator;

public class IteratorPatternMain {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
