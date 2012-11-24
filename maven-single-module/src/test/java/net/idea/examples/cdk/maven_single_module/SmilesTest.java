package net.idea.examples.cdk.maven_single_module;

import org.junit.Test;
import org.openscience.cdk.DefaultChemObjectBuilder;
import org.openscience.cdk.interfaces.IMolecule;
import org.openscience.cdk.smiles.SmilesGenerator;
import org.openscience.cdk.smiles.SmilesParser;

public class SmilesTest {
	@Test
	public void test() throws Exception {
		String smiles =
			"CC(C)(C)C1=CC(=C(OP2OCC3(COP(OC4=CC=C(C=C4C(C)(C)C)C(C)(C)C)OC3)CO2)C=C1)C(C)(C)C";
			SmilesParser sp = new SmilesParser(DefaultChemObjectBuilder.getInstance());
			IMolecule m = sp.parseSmiles(smiles);
			SmilesGenerator sg = new SmilesGenerator();
			String s_out = sg.createSMILES(m);
			System.out.println(s_out);
	}
}
