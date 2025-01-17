package Day13.TestUnits;
import org.junit.Assert;
import org.junit.Test;

public class PrimeCheckerTest {
    @Test
    public void testValidPrimes() {
        PrimeChecker pc = new PrimeChecker();
        Assert.assertTrue(pc.isPrime(2));
        Assert.assertTrue(pc.isPrime(3));
        Assert.assertTrue( pc.isPrime(5));
        Assert.assertTrue(pc.isPrime(7));
        Assert.assertTrue( pc.isPrime(13));
    }
    @Test
    public void testNonPrimeNumbers() {
        PrimeChecker pc = new PrimeChecker();
        Assert.assertFalse(pc.isPrime(4));  // 4 is not prime
        Assert.assertFalse( pc.isPrime(6));  // 6 is not prime
        Assert.assertFalse( pc.isPrime(9));  // 9 is not prime
    }
    @Test
    public void testEdgeCases() {
        PrimeChecker pc = new PrimeChecker();
        Assert.assertFalse( pc.isPrime(0));  // 0 is not prime
        Assert.assertFalse( pc.isPrime(1));  // 1 is not prime
        Assert.assertFalse(pc.isPrime(-5));  // Negative number is not prime
    }
    @Test
    public void testLargePrime() {
        PrimeChecker pc = new PrimeChecker();
        Assert.assertTrue( pc.isPrime(104729));  // A large prime number
    }
    @Test
    public void testLargeNonPrime() {
        PrimeChecker pc = new PrimeChecker();
        Assert.assertFalse( pc.isPrime(1000000));  // Not a prime
    }
}

