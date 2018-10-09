/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classification;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class StageResultsTest {
    
    private StageResults empty; // will have no credits and no marks
    private StageResults full; // will have 120 credits and marks
    private StageResults halfFull; // will have 60 credits and some marks
 
    public StageResultsTest() {
        
    }
    
    @Before
    public void setUp() {
        // empty - object that starts with default values
        empty = new StageResults();

        // full - object with 120 credits-worth of marks but no
        // initial stage2Average
        full = new StageResults();
        full.addModuleMark(120, 50.0);

        // halfFull - object with 60 credits worth of marks and
        // no initial stage2Average
        halfFull = new StageResults();
        halfFull.addModuleMark(60, 50.0); 
    }
    
    @After
    public void tearDown() {
         
    }

    @Test
    public void testGetStage2Average() {
         
    }

    @Test
    public void testGetTotalCredits() {
         
    }

    @Test
    public void testGetTotalMarks() {
        
    }

    @Test
    public void testSetStage2Average() {
         
    }

    @Test
    public void testIsComplete() {
        //fail("Test not yet implemented"); 
        System.out.println("Testing isComplete");

        // Check that the empty object is 'not complete'
        assertFalse("empty object", empty.isComplete()); 

        // Check that the full object is 'complete'
        assertTrue("empty object", full.isComplete()); 
        
        // Check that the halfFull object is 'not complete'
        assertFalse("empty object", halfFull.isComplete()); 
    }

    @Test
    public void testResetValues() {
        //fail("Test not yet implemented"); 
        System.out.println("Testing resetValues");

        // Set the state of the 'full' object to zeroes
        full.resetValues();

        // Set expected results
        int expIntResult = 0;
        double expDoubleResult = 0.0;

        // Now check each attribute to test that the reset has worked
        assertEquals("credits", expIntResult, full.getTotalCredits());
        assertEquals("total", expDoubleResult, full.getTotalMarks(), 0.0);

        // Put the 'full' object back to its original state
        full.addModuleMark(120, 50.0); 
    }

    @Test
    public void testAddModuleMark() {
        //fail("Test not yet implemented"); 
        
//        empty.addModuleMark(20, 70.00);
//        System.out.println(empty.getTotalCredits()); // expected: 20
//
//        empty.addModuleMark(10, 70.00); 
//        System.out.println(empty.getTotalCredits()); // expected: 30
//
//        empty.addModuleMark(40, 70.00);
//        System.out.println(empty.getTotalCredits()); // expected: 70
        
        empty.addModuleMark(20, 70.0);
        assertEquals("credits", 20, empty.getTotalCredits());
        assertEquals("marks", 140, empty.getTotalMarks(), 0.0);
        
        empty.addModuleMark(10, 70.0);
        assertEquals("credits", 30, empty.getTotalCredits());
        assertEquals("marks", 210, empty.getTotalMarks(), 0.0);
        
        empty.addModuleMark(40, 70.0);
        assertEquals("credits", 70, empty.getTotalCredits());
        assertEquals("marks", 490, empty.getTotalMarks(), 0.0);
        
        empty.resetValues();
    }

    @Test
    public void testCalculateAverageSoFar() {
        //fail("Test not yet implemented"); 
        // Test with no credits and no marks
        assertEquals("empty", 0.0, empty.calculateAverageSoFar(), 0.0); 
        
        // Test with 120 credits all at 50%
        assertEquals("full @ 50%", 50.0, full.calculateAverageSoFar(), 0.0); 
        
        // Test with 120 credits all at 100%
        full.resetValues();
        full.addModuleMark(120, 100.0);
        assertEquals("full @ 100%", 100.0, full.calculateAverageSoFar(), 0.0); 
    }

    @Test
    public void testPredictClass() {
        fail("Test not yet implemented"); 
    }
    
}
