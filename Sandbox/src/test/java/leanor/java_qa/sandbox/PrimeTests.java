package leanor.java_qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by leanor on 09.08.2016.
 */
public class PrimeTests {

  @Test (enabled = false)
  public void testPrime() {
    Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
  }


  @Test
  public void testNonPrime() {
    Assert.assertFalse(Primes.isPrimeFast(81));
  }

  @Test (enabled = false)
  public void testPrimeWhile() {
    Assert.assertTrue(Primes.isPrime(557));
  }


  @Test (enabled = false)
  public void testNonPrimeWhile() {
    Assert.assertFalse(Primes.isPrime(513));
  }

  @Test (enabled = false)
  public void testPrimeLong() {
    long n = Integer.MAX_VALUE;
    Assert.assertTrue(Primes.isPrime(n));
  }


  @Test (enabled = false)
  public void testNonPrimeLong() {
    long n = Integer.MAX_VALUE-1;
    Assert.assertFalse(Primes.isPrime(n));
  }


}


