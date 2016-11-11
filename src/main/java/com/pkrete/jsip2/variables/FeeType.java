/*
 * The MIT License
 *
 * Copyright 2012-2014 Petteri Kivimäki
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.pkrete.jsip2.variables;

/**
 * This enum defines a set of fee types that can be used in SIP2
 * response messages to describe the type of the fee related to a
 * transaction or to a patron.
 * 
 * @author Petteri Kivimäki
 */
public enum FeeType {

    OTHER_UNKNONW("01"), ADMINISTRATIVE("02"), DAMAGE("03"),
    OVERDUE("04"), PROCESSING("05"), RENTAL("06"),
    REPLACEMENT("07"), COMPUTER_ACCESS_CHARGE("08"),
    HOLD_FEE("09");
    private String value;

    private FeeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
