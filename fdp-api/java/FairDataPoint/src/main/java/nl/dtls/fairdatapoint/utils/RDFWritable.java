/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.dtls.fairdatapoint.utils;

import java.io.StringWriter;

/**
 *
 * @author Shamanou van Leeuwen
 * @Since 2016-07-02
 */
public interface RDFWritable {
        public void write(StringWriter writer, String format);
}
