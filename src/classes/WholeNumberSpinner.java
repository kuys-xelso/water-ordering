/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class WholeNumberSpinner extends JSpinner {
    
    public WholeNumberSpinner() {
           SpinnerNumberModel model = new PositiveNumberSpinnerModel();
        setModel(model);
    }

    private class PositiveNumberSpinnerModel extends SpinnerNumberModel {

        public PositiveNumberSpinnerModel() {
            super(1, 1, Integer.MAX_VALUE, 1);
        }

        @Override
        public Object getNextValue() {
            Object value = super.getNextValue();
            if (value instanceof Double) {
                return ((Double) value).intValue();
            }
            return value;
        }

        @Override
        public Object getPreviousValue() {
            Object value = super.getPreviousValue();
            if (value instanceof Double) {
                return ((Double) value).intValue();
            }
            return value;
        }
    }
}
