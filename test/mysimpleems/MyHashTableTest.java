/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysimpleems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ritvik
 */
public class MyHashTableTest {
    
    public MyHashTableTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNumInHashTable method, of class MyHashTable.
     */
    @Test
    public void testGetNumInHashTable() {
        System.out.println("getNumInHashTable");
        MyHashTable instance = null;
        int expResult = 0;
        int result = instance.getNumInHashTable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcBucket method, of class MyHashTable.
     */
    @Test
    public void testCalcBucket() {
        System.out.println("calcBucket");
        int keyValue = 0;
        MyHashTable instance = null;
        int expResult = 0;
        int result = instance.calcBucket(keyValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEmployee method, of class MyHashTable.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        EmployeeInfo theEmployee = null;
        MyHashTable instance = null;
        boolean expResult = false;
        boolean result = instance.addEmployee(theEmployee);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByEmployeeNumber method, of class MyHashTable.
     */
    @Test
    public void testSearchByEmployeeNumber() {
        System.out.println("searchByEmployeeNumber");
        int employeeNum = 0;
        MyHashTable instance = null;
        int expResult = 0;
        int result = instance.searchByEmployeeNumber(employeeNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayContents method, of class MyHashTable.
     */
    @Test
    public void testDisplayContents() {
        System.out.println("displayContents");
        MyHashTable instance = null;
        instance.displayContents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
