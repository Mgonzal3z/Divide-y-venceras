package co.edu.unbosque.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AlgoritmoUno {
	
	public AlgoritmoUno() {
		
	}
	
	public BigInteger mEnteros(BigInteger v, BigInteger u) {
		int n, s;
		BigInteger w,x,y,z;
		n = Math.max(u.bitLength(), v.bitLength());
		if(n < 5) {
			return u.multiply(v);
		}else {
			s = n/2;
			w = u.divide(BigDecimal.valueOf(Math.pow(10, s)).toBigInteger());
			x = u.mod(BigDecimal.valueOf(Math.pow(10, s)).toBigInteger());
			y = v.divide(BigDecimal.valueOf(Math.pow(10, s)).toBigInteger());
			z = v.mod(BigDecimal.valueOf(Math.pow(10,s)).toBigInteger());
			return ((w.multiply(y)).multiply(BigDecimal.valueOf(Math.pow(10,(2*s))).toBigInteger()))
					.add((w.multiply(z).add(x.multiply(y))).multiply(BigDecimal.valueOf(Math.pow(10, s)).toBigInteger()))
					.add((x.multiply(z)));
		}
	}

}
