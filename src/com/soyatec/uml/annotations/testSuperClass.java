package com.soyatec.uml.annotations;


public class testSuperClass {

		
		/**
		 */
		public String getString(){
			return "";	
		}

		/**
		 * @uml.property  name="testString"
		 */
		private String testString;

		/**
		 * Getter of the property <tt>testString</tt>
		 * @return  Returns the testString.
		 * @uml.property  name="testString"
		 */
		public String getTestString() {
			return testString;
		}

		/**
		 * Setter of the property <tt>testString</tt>
		 * @param testString  The testString to set.
		 * @uml.property  name="testString"
		 */
		public void setTestString(String testString) {
			this.testString = testString;
		}

}
