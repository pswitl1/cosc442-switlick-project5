import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JamesBondTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBondRegex0() {
		assertTrue(!JamesBond.bondRegex("("));
	}

	@Test
	public void testBondRegex1() {
		assertTrue(!JamesBond.bondRegex("(("));
	}

	@Test
	public void testBondRegex2() {
		assertTrue(!JamesBond.bondRegex("((("));
	}

	@Test
	public void testBondRegex3() {
		assertTrue(!JamesBond.bondRegex("(()"));
	}

	@Test
	public void testBondRegex4() {
		assertTrue(JamesBond.bondRegex("((007)"));
	}

	@Test
	public void testBondRegex5() {
		assertTrue(!JamesBond.bondRegex("((07)"));
	}

	@Test
	public void testBondRegex6() {
		assertTrue(!JamesBond.bondRegex("((7)"));
	}

	@Test
	public void testBondRegex7() {
		assertTrue(!JamesBond.bondRegex("()"));
	}

	@Test
	public void testBondRegex8() {
		assertTrue(!JamesBond.bondRegex("()("));
	}

	@Test
	public void testBondRegex9() {
		assertTrue(!JamesBond.bondRegex("())"));
	}

	@Test
	public void testBondRegex10() {
		assertTrue(JamesBond.bondRegex("()007)"));
	}

	@Test
	public void testBondRegex11() {
		assertTrue(!JamesBond.bondRegex("()07)"));
	}

	@Test
	public void testBondRegex12() {
		assertTrue(!JamesBond.bondRegex("()7)"));
	}

	@Test
	public void testBondRegex13() {
		assertTrue(!JamesBond.bondRegex("(0("));
	}

	@Test
	public void testBondRegex14() {
		assertTrue(!JamesBond.bondRegex("(0(("));
	}

	@Test
	public void testBondRegex15() {
		assertTrue(!JamesBond.bondRegex("(0()"));
	}

	@Test
	public void testBondRegex16() {
		assertTrue(JamesBond.bondRegex("(0(007)"));
	}

	@Test
	public void testBondRegex17() {
		assertTrue(!JamesBond.bondRegex("(0(07)"));
	}

	@Test
	public void testBondRegex18() {
		assertTrue(!JamesBond.bondRegex("(0(7)"));
	}

	@Test
	public void testBondRegex19() {
		assertTrue(!JamesBond.bondRegex("(0)"));
	}

	@Test
	public void testBondRegex20() {
		assertTrue(!JamesBond.bondRegex("(0)("));
	}

	@Test
	public void testBondRegex21() {
		assertTrue(!JamesBond.bondRegex("(0))"));
	}

	@Test
	public void testBondRegex22() {
		assertTrue(JamesBond.bondRegex("(0)007)"));
	}

	@Test
	public void testBondRegex23() {
		assertTrue(!JamesBond.bondRegex("(0)07)"));
	}

	@Test
	public void testBondRegex24() {
		assertTrue(!JamesBond.bondRegex("(0)7)"));
	}

	@Test
	public void testBondRegex25() {
		assertTrue(!JamesBond.bondRegex("(00("));
	}

	@Test
	public void testBondRegex26() {
		assertTrue(!JamesBond.bondRegex("(00(("));
	}

	@Test
	public void testBondRegex27() {
		assertTrue(!JamesBond.bondRegex("(00()"));
	}

	@Test
	public void testBondRegex28() {
		assertTrue(JamesBond.bondRegex("(00(007)"));
	}

	@Test
	public void testBondRegex29() {
		assertTrue(!JamesBond.bondRegex("(00(07)"));
	}

	@Test
	public void testBondRegex30() {
		assertTrue(!JamesBond.bondRegex("(00(7)"));
	}

	@Test
	public void testBondRegex31() {
		assertTrue(!JamesBond.bondRegex("(00)"));
	}

	@Test
	public void testBondRegex32() {
		assertTrue(!JamesBond.bondRegex("(00)("));
	}

	@Test
	public void testBondRegex33() {
		assertTrue(!JamesBond.bondRegex("(00))"));
	}

	@Test
	public void testBondRegex34() {
		assertTrue(JamesBond.bondRegex("(00)007)"));
	}

	@Test
	public void testBondRegex35() {
		assertTrue(!JamesBond.bondRegex("(00)07)"));
	}

	@Test
	public void testBondRegex36() {
		assertTrue(!JamesBond.bondRegex("(00)7)"));
	}

	@Test
	public void testBondRegex37() {
		assertTrue(!JamesBond.bondRegex("(000("));
	}

	@Test
	public void testBondRegex38() {
		assertTrue(!JamesBond.bondRegex("(000)"));
	}

	@Test
	public void testBondRegex39() {
		assertTrue(JamesBond.bondRegex("(000007)"));
	}

	@Test
	public void testBondRegex40() {
		assertTrue(JamesBond.bondRegex("(00007)"));
	}

	@Test
	public void testBondRegex41() {
		assertTrue(JamesBond.bondRegex("(0007)"));
	}

	@Test
	public void testBondRegex42() {
		assertTrue(!JamesBond.bondRegex("(001("));
	}

	@Test
	public void testBondRegex43() {
		assertTrue(!JamesBond.bondRegex("(001)"));
	}

	@Test
	public void testBondRegex44() {
		assertTrue(JamesBond.bondRegex("(001007)"));
	}

	@Test
	public void testBondRegex45() {
		assertTrue(!JamesBond.bondRegex("(00107)"));
	}

	@Test
	public void testBondRegex46() {
		assertTrue(!JamesBond.bondRegex("(0017)"));
	}

	@Test
	public void testBondRegex47() {
		assertTrue(!JamesBond.bondRegex("(002("));
	}

	@Test
	public void testBondRegex48() {
		assertTrue(!JamesBond.bondRegex("(002)"));
	}

	@Test
	public void testBondRegex49() {
		assertTrue(JamesBond.bondRegex("(002007)"));
	}

	@Test
	public void testBondRegex50() {
		assertTrue(!JamesBond.bondRegex("(00207)"));
	}

	@Test
	public void testBondRegex51() {
		assertTrue(!JamesBond.bondRegex("(0027)"));
	}

	@Test
	public void testBondRegex52() {
		assertTrue(!JamesBond.bondRegex("(003("));
	}

	@Test
	public void testBondRegex53() {
		assertTrue(!JamesBond.bondRegex("(003)"));
	}

	@Test
	public void testBondRegex54() {
		assertTrue(JamesBond.bondRegex("(003007)"));
	}

	@Test
	public void testBondRegex55() {
		assertTrue(!JamesBond.bondRegex("(00307)"));
	}

	@Test
	public void testBondRegex56() {
		assertTrue(!JamesBond.bondRegex("(0037)"));
	}

	@Test
	public void testBondRegex57() {
		assertTrue(!JamesBond.bondRegex("(004("));
	}

	@Test
	public void testBondRegex58() {
		assertTrue(!JamesBond.bondRegex("(004)"));
	}

	@Test
	public void testBondRegex59() {
		assertTrue(JamesBond.bondRegex("(004007)"));
	}

	@Test
	public void testBondRegex60() {
		assertTrue(!JamesBond.bondRegex("(00407)"));
	}

	@Test
	public void testBondRegex61() {
		assertTrue(!JamesBond.bondRegex("(0047)"));
	}

	@Test
	public void testBondRegex62() {
		assertTrue(!JamesBond.bondRegex("(005("));
	}

	@Test
	public void testBondRegex63() {
		assertTrue(!JamesBond.bondRegex("(005)"));
	}

	@Test
	public void testBondRegex64() {
		assertTrue(JamesBond.bondRegex("(005007)"));
	}

	@Test
	public void testBondRegex65() {
		assertTrue(!JamesBond.bondRegex("(00507)"));
	}

	@Test
	public void testBondRegex66() {
		assertTrue(!JamesBond.bondRegex("(0057)"));
	}

	@Test
	public void testBondRegex67() {
		assertTrue(!JamesBond.bondRegex("(006("));
	}

	@Test
	public void testBondRegex68() {
		assertTrue(!JamesBond.bondRegex("(006)"));
	}

	@Test
	public void testBondRegex69() {
		assertTrue(JamesBond.bondRegex("(006007)"));
	}

	@Test
	public void testBondRegex70() {
		assertTrue(!JamesBond.bondRegex("(00607)"));
	}

	@Test
	public void testBondRegex71() {
		assertTrue(!JamesBond.bondRegex("(0067)"));
	}

	@Test
	public void testBondRegex72() {
		assertTrue(!JamesBond.bondRegex("(007("));
	}

	@Test
	public void testBondRegex73() {
		assertTrue(!JamesBond.bondRegex("(007(("));
	}

	@Test
	public void testBondRegex74() {
		assertTrue(JamesBond.bondRegex("(007()"));
	}

	@Test
	public void testBondRegex75() {
		assertTrue(JamesBond.bondRegex("(007(007)"));
	}

	@Test
	public void testBondRegex76() {
		assertTrue(JamesBond.bondRegex("(007(07)"));
	}

	@Test
	public void testBondRegex77() {
		assertTrue(JamesBond.bondRegex("(007(7)"));
	}

	@Test
	public void testBondRegex78() {
		assertTrue(JamesBond.bondRegex("(007)"));
	}

	@Test
	public void testBondRegex79() {
		assertTrue(JamesBond.bondRegex("(007)("));
	}

	@Test
	public void testBondRegex80() {
		assertTrue(JamesBond.bondRegex("(007)(("));
	}

	@Test
	public void testBondRegex81() {
		assertTrue(JamesBond.bondRegex("(007)()"));
	}

	@Test
	public void testBondRegex82() {
		assertTrue(JamesBond.bondRegex("(007)(007)"));
	}

	@Test
	public void testBondRegex83() {
		assertTrue(JamesBond.bondRegex("(007)(07)"));
	}

	@Test
	public void testBondRegex84() {
		assertTrue(JamesBond.bondRegex("(007)(7)"));
	}

	@Test
	public void testBondRegex85() {
		assertTrue(JamesBond.bondRegex("(007))"));
	}

	@Test
	public void testBondRegex86() {
		assertTrue(JamesBond.bondRegex("(007))("));
	}

	@Test
	public void testBondRegex87() {
		assertTrue(JamesBond.bondRegex("(007)))"));
	}

	@Test
	public void testBondRegex88() {
		assertTrue(JamesBond.bondRegex("(007))007)"));
	}

	@Test
	public void testBondRegex89() {
		assertTrue(JamesBond.bondRegex("(007))07)"));
	}

	@Test
	public void testBondRegex90() {
		assertTrue(JamesBond.bondRegex("(007))7)"));
	}

	@Test
	public void testBondRegex91() {
		assertTrue(JamesBond.bondRegex("(007)0("));
	}

	@Test
	public void testBondRegex92() {
		assertTrue(JamesBond.bondRegex("(007)0)"));
	}

	@Test
	public void testBondRegex93() {
		assertTrue(JamesBond.bondRegex("(007)0007)"));
	}

	@Test
	public void testBondRegex94() {
		assertTrue(JamesBond.bondRegex("(007)007)"));
	}

	@Test
	public void testBondRegex95() {
		assertTrue(JamesBond.bondRegex("(007)07)"));
	}

	@Test
	public void testBondRegex96() {
		assertTrue(JamesBond.bondRegex("(007)1("));
	}

	@Test
	public void testBondRegex97() {
		assertTrue(JamesBond.bondRegex("(007)1)"));
	}

	@Test
	public void testBondRegex98() {
		assertTrue(JamesBond.bondRegex("(007)1007)"));
	}

	@Test
	public void testBondRegex99() {
		assertTrue(JamesBond.bondRegex("(007)107)"));
	}

	@Test
	public void testBondRegex100() {
		assertTrue(JamesBond.bondRegex("(007)17)"));
	}

	@Test
	public void testBondRegex101() {
		assertTrue(JamesBond.bondRegex("(007)2("));
	}

	@Test
	public void testBondRegex102() {
		assertTrue(JamesBond.bondRegex("(007)2)"));
	}

	@Test
	public void testBondRegex103() {
		assertTrue(JamesBond.bondRegex("(007)2007)"));
	}

	@Test
	public void testBondRegex104() {
		assertTrue(JamesBond.bondRegex("(007)207)"));
	}

	@Test
	public void testBondRegex105() {
		assertTrue(JamesBond.bondRegex("(007)27)"));
	}

	@Test
	public void testBondRegex106() {
		assertTrue(JamesBond.bondRegex("(007)3("));
	}

	@Test
	public void testBondRegex107() {
		assertTrue(JamesBond.bondRegex("(007)3)"));
	}

	@Test
	public void testBondRegex108() {
		assertTrue(JamesBond.bondRegex("(007)3007)"));
	}

	@Test
	public void testBondRegex109() {
		assertTrue(JamesBond.bondRegex("(007)307)"));
	}

	@Test
	public void testBondRegex110() {
		assertTrue(JamesBond.bondRegex("(007)37)"));
	}

	@Test
	public void testBondRegex111() {
		assertTrue(JamesBond.bondRegex("(007)4("));
	}

	@Test
	public void testBondRegex112() {
		assertTrue(JamesBond.bondRegex("(007)4)"));
	}

	@Test
	public void testBondRegex113() {
		assertTrue(JamesBond.bondRegex("(007)4007)"));
	}

	@Test
	public void testBondRegex114() {
		assertTrue(JamesBond.bondRegex("(007)407)"));
	}

	@Test
	public void testBondRegex115() {
		assertTrue(JamesBond.bondRegex("(007)47)"));
	}

	@Test
	public void testBondRegex116() {
		assertTrue(JamesBond.bondRegex("(007)5("));
	}

	@Test
	public void testBondRegex117() {
		assertTrue(JamesBond.bondRegex("(007)5)"));
	}

	@Test
	public void testBondRegex118() {
		assertTrue(JamesBond.bondRegex("(007)5007)"));
	}

	@Test
	public void testBondRegex119() {
		assertTrue(JamesBond.bondRegex("(007)507)"));
	}

	@Test
	public void testBondRegex120() {
		assertTrue(JamesBond.bondRegex("(007)57)"));
	}

	@Test
	public void testBondRegex121() {
		assertTrue(JamesBond.bondRegex("(007)6("));
	}

	@Test
	public void testBondRegex122() {
		assertTrue(JamesBond.bondRegex("(007)6)"));
	}

	@Test
	public void testBondRegex123() {
		assertTrue(JamesBond.bondRegex("(007)6007)"));
	}

	@Test
	public void testBondRegex124() {
		assertTrue(JamesBond.bondRegex("(007)607)"));
	}

	@Test
	public void testBondRegex125() {
		assertTrue(JamesBond.bondRegex("(007)67)"));
	}

	@Test
	public void testBondRegex126() {
		assertTrue(JamesBond.bondRegex("(007)7("));
	}

	@Test
	public void testBondRegex127() {
		assertTrue(JamesBond.bondRegex("(007)7)"));
	}

	@Test
	public void testBondRegex128() {
		assertTrue(JamesBond.bondRegex("(007)7007)"));
	}

	@Test
	public void testBondRegex129() {
		assertTrue(JamesBond.bondRegex("(007)707)"));
	}

	@Test
	public void testBondRegex130() {
		assertTrue(JamesBond.bondRegex("(007)77)"));
	}

	@Test
	public void testBondRegex131() {
		assertTrue(JamesBond.bondRegex("(007)8("));
	}

	@Test
	public void testBondRegex132() {
		assertTrue(JamesBond.bondRegex("(007)8)"));
	}

	@Test
	public void testBondRegex133() {
		assertTrue(JamesBond.bondRegex("(007)8007)"));
	}

	@Test
	public void testBondRegex134() {
		assertTrue(JamesBond.bondRegex("(007)807)"));
	}

	@Test
	public void testBondRegex135() {
		assertTrue(JamesBond.bondRegex("(007)87)"));
	}

	@Test
	public void testBondRegex136() {
		assertTrue(JamesBond.bondRegex("(007)9("));
	}

	@Test
	public void testBondRegex137() {
		assertTrue(JamesBond.bondRegex("(007)9)"));
	}

	@Test
	public void testBondRegex138() {
		assertTrue(JamesBond.bondRegex("(007)9007)"));
	}

	@Test
	public void testBondRegex139() {
		assertTrue(JamesBond.bondRegex("(007)907)"));
	}

	@Test
	public void testBondRegex140() {
		assertTrue(JamesBond.bondRegex("(007)97)"));
	}

	@Test
	public void testBondRegex141() {
		assertTrue(!JamesBond.bondRegex("(0070("));
	}

	@Test
	public void testBondRegex142() {
		assertTrue(JamesBond.bondRegex("(0070)"));
	}

	@Test
	public void testBondRegex143() {
		assertTrue(JamesBond.bondRegex("(0070007)"));
	}

	@Test
	public void testBondRegex144() {
		assertTrue(JamesBond.bondRegex("(007007)"));
	}

	@Test
	public void testBondRegex145() {
		assertTrue(JamesBond.bondRegex("(00707)"));
	}

	@Test
	public void testBondRegex146() {
		assertTrue(!JamesBond.bondRegex("(0071("));
	}

	@Test
	public void testBondRegex147() {
		assertTrue(JamesBond.bondRegex("(0071)"));
	}

	@Test
	public void testBondRegex148() {
		assertTrue(JamesBond.bondRegex("(0071007)"));
	}

	@Test
	public void testBondRegex149() {
		assertTrue(JamesBond.bondRegex("(007107)"));
	}

	@Test
	public void testBondRegex150() {
		assertTrue(JamesBond.bondRegex("(00717)"));
	}

	@Test
	public void testBondRegex151() {
		assertTrue(!JamesBond.bondRegex("(0072("));
	}

	@Test
	public void testBondRegex152() {
		assertTrue(JamesBond.bondRegex("(0072)"));
	}

	@Test
	public void testBondRegex153() {
		assertTrue(JamesBond.bondRegex("(0072007)"));
	}

	@Test
	public void testBondRegex154() {
		assertTrue(JamesBond.bondRegex("(007207)"));
	}

	@Test
	public void testBondRegex155() {
		assertTrue(JamesBond.bondRegex("(00727)"));
	}

	@Test
	public void testBondRegex156() {
		assertTrue(!JamesBond.bondRegex("(0073("));
	}

	@Test
	public void testBondRegex157() {
		assertTrue(JamesBond.bondRegex("(0073)"));
	}

	@Test
	public void testBondRegex158() {
		assertTrue(JamesBond.bondRegex("(0073007)"));
	}

	@Test
	public void testBondRegex159() {
		assertTrue(JamesBond.bondRegex("(007307)"));
	}

	@Test
	public void testBondRegex160() {
		assertTrue(JamesBond.bondRegex("(00737)"));
	}

	@Test
	public void testBondRegex161() {
		assertTrue(!JamesBond.bondRegex("(0074("));
	}

	@Test
	public void testBondRegex162() {
		assertTrue(JamesBond.bondRegex("(0074)"));
	}

	@Test
	public void testBondRegex163() {
		assertTrue(JamesBond.bondRegex("(0074007)"));
	}

	@Test
	public void testBondRegex164() {
		assertTrue(JamesBond.bondRegex("(007407)"));
	}

	@Test
	public void testBondRegex165() {
		assertTrue(JamesBond.bondRegex("(00747)"));
	}

	@Test
	public void testBondRegex166() {
		assertTrue(!JamesBond.bondRegex("(0075("));
	}

	@Test
	public void testBondRegex167() {
		assertTrue(JamesBond.bondRegex("(0075)"));
	}

	@Test
	public void testBondRegex168() {
		assertTrue(JamesBond.bondRegex("(0075007)"));
	}

	@Test
	public void testBondRegex169() {
		assertTrue(JamesBond.bondRegex("(007507)"));
	}

	@Test
	public void testBondRegex170() {
		assertTrue(JamesBond.bondRegex("(00757)"));
	}

	@Test
	public void testBondRegex171() {
		assertTrue(!JamesBond.bondRegex("(0076("));
	}

	@Test
	public void testBondRegex172() {
		assertTrue(JamesBond.bondRegex("(0076)"));
	}

	@Test
	public void testBondRegex173() {
		assertTrue(JamesBond.bondRegex("(0076007)"));
	}

	@Test
	public void testBondRegex174() {
		assertTrue(JamesBond.bondRegex("(007607)"));
	}

	@Test
	public void testBondRegex175() {
		assertTrue(JamesBond.bondRegex("(00767)"));
	}

	@Test
	public void testBondRegex176() {
		assertTrue(!JamesBond.bondRegex("(0077("));
	}

	@Test
	public void testBondRegex177() {
		assertTrue(JamesBond.bondRegex("(0077)"));
	}

	@Test
	public void testBondRegex178() {
		assertTrue(JamesBond.bondRegex("(0077007)"));
	}

	@Test
	public void testBondRegex179() {
		assertTrue(JamesBond.bondRegex("(007707)"));
	}

	@Test
	public void testBondRegex180() {
		assertTrue(JamesBond.bondRegex("(00777)"));
	}

	@Test
	public void testBondRegex181() {
		assertTrue(!JamesBond.bondRegex("(0078("));
	}

	@Test
	public void testBondRegex182() {
		assertTrue(JamesBond.bondRegex("(0078)"));
	}

	@Test
	public void testBondRegex183() {
		assertTrue(JamesBond.bondRegex("(0078007)"));
	}

	@Test
	public void testBondRegex184() {
		assertTrue(JamesBond.bondRegex("(007807)"));
	}

	@Test
	public void testBondRegex185() {
		assertTrue(JamesBond.bondRegex("(00787)"));
	}

	@Test
	public void testBondRegex186() {
		assertTrue(!JamesBond.bondRegex("(0079("));
	}

	@Test
	public void testBondRegex187() {
		assertTrue(JamesBond.bondRegex("(0079)"));
	}

	@Test
	public void testBondRegex188() {
		assertTrue(JamesBond.bondRegex("(0079007)"));
	}

	@Test
	public void testBondRegex189() {
		assertTrue(JamesBond.bondRegex("(007907)"));
	}

	@Test
	public void testBondRegex190() {
		assertTrue(JamesBond.bondRegex("(00797)"));
	}

	@Test
	public void testBondRegex191() {
		assertTrue(!JamesBond.bondRegex("(008("));
	}

	@Test
	public void testBondRegex192() {
		assertTrue(!JamesBond.bondRegex("(008)"));
	}

	@Test
	public void testBondRegex193() {
		assertTrue(JamesBond.bondRegex("(008007)"));
	}

	@Test
	public void testBondRegex194() {
		assertTrue(!JamesBond.bondRegex("(00807)"));
	}

	@Test
	public void testBondRegex195() {
		assertTrue(!JamesBond.bondRegex("(0087)"));
	}

	@Test
	public void testBondRegex196() {
		assertTrue(!JamesBond.bondRegex("(009("));
	}

	@Test
	public void testBondRegex197() {
		assertTrue(!JamesBond.bondRegex("(009)"));
	}

	@Test
	public void testBondRegex198() {
		assertTrue(JamesBond.bondRegex("(009007)"));
	}

	@Test
	public void testBondRegex199() {
		assertTrue(!JamesBond.bondRegex("(00907)"));
	}

	@Test
	public void testBondRegex200() {
		assertTrue(!JamesBond.bondRegex("(0097)"));
	}

	@Test
	public void testBondRegex201() {
		assertTrue(!JamesBond.bondRegex("(01("));
	}

	@Test
	public void testBondRegex202() {
		assertTrue(!JamesBond.bondRegex("(01)"));
	}

	@Test
	public void testBondRegex203() {
		assertTrue(JamesBond.bondRegex("(01007)"));
	}

	@Test
	public void testBondRegex204() {
		assertTrue(!JamesBond.bondRegex("(0107)"));
	}

	@Test
	public void testBondRegex205() {
		assertTrue(!JamesBond.bondRegex("(017)"));
	}

	@Test
	public void testBondRegex206() {
		assertTrue(!JamesBond.bondRegex("(02("));
	}

	@Test
	public void testBondRegex207() {
		assertTrue(!JamesBond.bondRegex("(02)"));
	}

	@Test
	public void testBondRegex208() {
		assertTrue(JamesBond.bondRegex("(02007)"));
	}

	@Test
	public void testBondRegex209() {
		assertTrue(!JamesBond.bondRegex("(0207)"));
	}

	@Test
	public void testBondRegex210() {
		assertTrue(!JamesBond.bondRegex("(027)"));
	}

	@Test
	public void testBondRegex211() {
		assertTrue(!JamesBond.bondRegex("(03("));
	}

	@Test
	public void testBondRegex212() {
		assertTrue(!JamesBond.bondRegex("(03)"));
	}

	@Test
	public void testBondRegex213() {
		assertTrue(JamesBond.bondRegex("(03007)"));
	}

	@Test
	public void testBondRegex214() {
		assertTrue(!JamesBond.bondRegex("(0307)"));
	}

	@Test
	public void testBondRegex215() {
		assertTrue(!JamesBond.bondRegex("(037)"));
	}

	@Test
	public void testBondRegex216() {
		assertTrue(!JamesBond.bondRegex("(04("));
	}

	@Test
	public void testBondRegex217() {
		assertTrue(!JamesBond.bondRegex("(04)"));
	}

	@Test
	public void testBondRegex218() {
		assertTrue(JamesBond.bondRegex("(04007)"));
	}

	@Test
	public void testBondRegex219() {
		assertTrue(!JamesBond.bondRegex("(0407)"));
	}

	@Test
	public void testBondRegex220() {
		assertTrue(!JamesBond.bondRegex("(047)"));
	}

	@Test
	public void testBondRegex221() {
		assertTrue(!JamesBond.bondRegex("(05("));
	}

	@Test
	public void testBondRegex222() {
		assertTrue(!JamesBond.bondRegex("(05)"));
	}

	@Test
	public void testBondRegex223() {
		assertTrue(JamesBond.bondRegex("(05007)"));
	}

	@Test
	public void testBondRegex224() {
		assertTrue(!JamesBond.bondRegex("(0507)"));
	}

	@Test
	public void testBondRegex225() {
		assertTrue(!JamesBond.bondRegex("(057)"));
	}

	@Test
	public void testBondRegex226() {
		assertTrue(!JamesBond.bondRegex("(06("));
	}

	@Test
	public void testBondRegex227() {
		assertTrue(!JamesBond.bondRegex("(06)"));
	}

	@Test
	public void testBondRegex228() {
		assertTrue(JamesBond.bondRegex("(06007)"));
	}

	@Test
	public void testBondRegex229() {
		assertTrue(!JamesBond.bondRegex("(0607)"));
	}

	@Test
	public void testBondRegex230() {
		assertTrue(!JamesBond.bondRegex("(067)"));
	}

	@Test
	public void testBondRegex231() {
		assertTrue(!JamesBond.bondRegex("(07("));
	}

	@Test
	public void testBondRegex232() {
		assertTrue(!JamesBond.bondRegex("(07)"));
	}

	@Test
	public void testBondRegex233() {
		assertTrue(JamesBond.bondRegex("(07007)"));
	}

	@Test
	public void testBondRegex234() {
		assertTrue(!JamesBond.bondRegex("(0707)"));
	}

	@Test
	public void testBondRegex235() {
		assertTrue(!JamesBond.bondRegex("(077)"));
	}

	@Test
	public void testBondRegex236() {
		assertTrue(!JamesBond.bondRegex("(08("));
	}

	@Test
	public void testBondRegex237() {
		assertTrue(!JamesBond.bondRegex("(08)"));
	}

	@Test
	public void testBondRegex238() {
		assertTrue(JamesBond.bondRegex("(08007)"));
	}

	@Test
	public void testBondRegex239() {
		assertTrue(!JamesBond.bondRegex("(0807)"));
	}

	@Test
	public void testBondRegex240() {
		assertTrue(!JamesBond.bondRegex("(087)"));
	}

	@Test
	public void testBondRegex241() {
		assertTrue(!JamesBond.bondRegex("(09("));
	}

	@Test
	public void testBondRegex242() {
		assertTrue(!JamesBond.bondRegex("(09)"));
	}

	@Test
	public void testBondRegex243() {
		assertTrue(JamesBond.bondRegex("(09007)"));
	}

	@Test
	public void testBondRegex244() {
		assertTrue(!JamesBond.bondRegex("(0907)"));
	}

	@Test
	public void testBondRegex245() {
		assertTrue(!JamesBond.bondRegex("(097)"));
	}

	@Test
	public void testBondRegex246() {
		assertTrue(!JamesBond.bondRegex("(1("));
	}

	@Test
	public void testBondRegex247() {
		assertTrue(!JamesBond.bondRegex("(1)"));
	}

	@Test
	public void testBondRegex248() {
		assertTrue(JamesBond.bondRegex("(1007)"));
	}

	@Test
	public void testBondRegex249() {
		assertTrue(!JamesBond.bondRegex("(107)"));
	}

	@Test
	public void testBondRegex250() {
		assertTrue(!JamesBond.bondRegex("(17)"));
	}

	@Test
	public void testBondRegex251() {
		assertTrue(!JamesBond.bondRegex("(2("));
	}

	@Test
	public void testBondRegex252() {
		assertTrue(!JamesBond.bondRegex("(2)"));
	}

	@Test
	public void testBondRegex253() {
		assertTrue(JamesBond.bondRegex("(2007)"));
	}

	@Test
	public void testBondRegex254() {
		assertTrue(!JamesBond.bondRegex("(207)"));
	}

	@Test
	public void testBondRegex255() {
		assertTrue(!JamesBond.bondRegex("(27)"));
	}

	@Test
	public void testBondRegex256() {
		assertTrue(!JamesBond.bondRegex("(3("));
	}

	@Test
	public void testBondRegex257() {
		assertTrue(!JamesBond.bondRegex("(3)"));
	}

	@Test
	public void testBondRegex258() {
		assertTrue(JamesBond.bondRegex("(3007)"));
	}

	@Test
	public void testBondRegex259() {
		assertTrue(!JamesBond.bondRegex("(307)"));
	}

	@Test
	public void testBondRegex260() {
		assertTrue(!JamesBond.bondRegex("(37)"));
	}

	@Test
	public void testBondRegex261() {
		assertTrue(!JamesBond.bondRegex("(4("));
	}

	@Test
	public void testBondRegex262() {
		assertTrue(!JamesBond.bondRegex("(4)"));
	}

	@Test
	public void testBondRegex263() {
		assertTrue(JamesBond.bondRegex("(4007)"));
	}

	@Test
	public void testBondRegex264() {
		assertTrue(!JamesBond.bondRegex("(407)"));
	}

	@Test
	public void testBondRegex265() {
		assertTrue(!JamesBond.bondRegex("(47)"));
	}

	@Test
	public void testBondRegex266() {
		assertTrue(!JamesBond.bondRegex("(5("));
	}

	@Test
	public void testBondRegex267() {
		assertTrue(!JamesBond.bondRegex("(5)"));
	}

	@Test
	public void testBondRegex268() {
		assertTrue(JamesBond.bondRegex("(5007)"));
	}

	@Test
	public void testBondRegex269() {
		assertTrue(!JamesBond.bondRegex("(507)"));
	}

	@Test
	public void testBondRegex270() {
		assertTrue(!JamesBond.bondRegex("(57)"));
	}

	@Test
	public void testBondRegex271() {
		assertTrue(!JamesBond.bondRegex("(6("));
	}

	@Test
	public void testBondRegex272() {
		assertTrue(!JamesBond.bondRegex("(6)"));
	}

	@Test
	public void testBondRegex273() {
		assertTrue(JamesBond.bondRegex("(6007)"));
	}

	@Test
	public void testBondRegex274() {
		assertTrue(!JamesBond.bondRegex("(607)"));
	}

	@Test
	public void testBondRegex275() {
		assertTrue(!JamesBond.bondRegex("(67)"));
	}

	@Test
	public void testBondRegex276() {
		assertTrue(!JamesBond.bondRegex("(7("));
	}

	@Test
	public void testBondRegex277() {
		assertTrue(!JamesBond.bondRegex("(7)"));
	}

	@Test
	public void testBondRegex278() {
		assertTrue(JamesBond.bondRegex("(7007)"));
	}

	@Test
	public void testBondRegex279() {
		assertTrue(!JamesBond.bondRegex("(707)"));
	}

	@Test
	public void testBondRegex280() {
		assertTrue(!JamesBond.bondRegex("(77)"));
	}

	@Test
	public void testBondRegex281() {
		assertTrue(!JamesBond.bondRegex("(8("));
	}

	@Test
	public void testBondRegex282() {
		assertTrue(!JamesBond.bondRegex("(8)"));
	}

	@Test
	public void testBondRegex283() {
		assertTrue(JamesBond.bondRegex("(8007)"));
	}

	@Test
	public void testBondRegex284() {
		assertTrue(!JamesBond.bondRegex("(807)"));
	}

	@Test
	public void testBondRegex285() {
		assertTrue(!JamesBond.bondRegex("(87)"));
	}

	@Test
	public void testBondRegex286() {
		assertTrue(!JamesBond.bondRegex("(9("));
	}

	@Test
	public void testBondRegex287() {
		assertTrue(!JamesBond.bondRegex("(9)"));
	}

	@Test
	public void testBondRegex288() {
		assertTrue(JamesBond.bondRegex("(9007)"));
	}

	@Test
	public void testBondRegex289() {
		assertTrue(!JamesBond.bondRegex("(907)"));
	}

	@Test
	public void testBondRegex290() {
		assertTrue(!JamesBond.bondRegex("(97)"));
	}

	@Test
	public void testBondRegex291() {
		assertTrue(!JamesBond.bondRegex(")"));
	}

	@Test
	public void testBondRegex292() {
		assertTrue(!JamesBond.bondRegex(")("));
	}

	@Test
	public void testBondRegex293() {
		assertTrue(!JamesBond.bondRegex("))"));
	}

	@Test
	public void testBondRegex294() {
		assertTrue(!JamesBond.bondRegex(")007)"));
	}

	@Test
	public void testBondRegex295() {
		assertTrue(!JamesBond.bondRegex(")07)"));
	}

	@Test
	public void testBondRegex296() {
		assertTrue(!JamesBond.bondRegex(")7)"));
	}

	@Test
	public void testBondRegex297() {
		assertTrue(!JamesBond.bondRegex("0("));
	}

	@Test
	public void testBondRegex298() {
		assertTrue(!JamesBond.bondRegex("0)"));
	}

	@Test
	public void testBondRegex299() {
		assertTrue(!JamesBond.bondRegex("0007)"));
	}

	@Test
	public void testBondRegex300() {
		assertTrue(!JamesBond.bondRegex("007)"));
	}

	@Test
	public void testBondRegex301() {
		assertTrue(!JamesBond.bondRegex("07)"));
	}

	@Test
	public void testBondRegex302() {
		assertTrue(!JamesBond.bondRegex("1("));
	}

	@Test
	public void testBondRegex303() {
		assertTrue(!JamesBond.bondRegex("1)"));
	}

	@Test
	public void testBondRegex304() {
		assertTrue(!JamesBond.bondRegex("1007)"));
	}

	@Test
	public void testBondRegex305() {
		assertTrue(!JamesBond.bondRegex("107)"));
	}

	@Test
	public void testBondRegex306() {
		assertTrue(!JamesBond.bondRegex("17)"));
	}

	@Test
	public void testBondRegex307() {
		assertTrue(!JamesBond.bondRegex("2("));
	}

	@Test
	public void testBondRegex308() {
		assertTrue(!JamesBond.bondRegex("2)"));
	}

	@Test
	public void testBondRegex309() {
		assertTrue(!JamesBond.bondRegex("2007)"));
	}

	@Test
	public void testBondRegex310() {
		assertTrue(!JamesBond.bondRegex("207)"));
	}

	@Test
	public void testBondRegex311() {
		assertTrue(!JamesBond.bondRegex("27)"));
	}

	@Test
	public void testBondRegex312() {
		assertTrue(!JamesBond.bondRegex("3("));
	}

	@Test
	public void testBondRegex313() {
		assertTrue(!JamesBond.bondRegex("3)"));
	}

	@Test
	public void testBondRegex314() {
		assertTrue(!JamesBond.bondRegex("3007)"));
	}

	@Test
	public void testBondRegex315() {
		assertTrue(!JamesBond.bondRegex("307)"));
	}

	@Test
	public void testBondRegex316() {
		assertTrue(!JamesBond.bondRegex("37)"));
	}

	@Test
	public void testBondRegex317() {
		assertTrue(!JamesBond.bondRegex("4("));
	}

	@Test
	public void testBondRegex318() {
		assertTrue(!JamesBond.bondRegex("4)"));
	}

	@Test
	public void testBondRegex319() {
		assertTrue(!JamesBond.bondRegex("4007)"));
	}

	@Test
	public void testBondRegex320() {
		assertTrue(!JamesBond.bondRegex("407)"));
	}

	@Test
	public void testBondRegex321() {
		assertTrue(!JamesBond.bondRegex("47)"));
	}

	@Test
	public void testBondRegex322() {
		assertTrue(!JamesBond.bondRegex("5("));
	}

	@Test
	public void testBondRegex323() {
		assertTrue(!JamesBond.bondRegex("5)"));
	}

	@Test
	public void testBondRegex324() {
		assertTrue(!JamesBond.bondRegex("5007)"));
	}

	@Test
	public void testBondRegex325() {
		assertTrue(!JamesBond.bondRegex("507)"));
	}

	@Test
	public void testBondRegex326() {
		assertTrue(!JamesBond.bondRegex("57)"));
	}

	@Test
	public void testBondRegex327() {
		assertTrue(!JamesBond.bondRegex("6("));
	}

	@Test
	public void testBondRegex328() {
		assertTrue(!JamesBond.bondRegex("6)"));
	}

	@Test
	public void testBondRegex329() {
		assertTrue(!JamesBond.bondRegex("6007)"));
	}

	@Test
	public void testBondRegex330() {
		assertTrue(!JamesBond.bondRegex("607)"));
	}

	@Test
	public void testBondRegex331() {
		assertTrue(!JamesBond.bondRegex("67)"));
	}

	@Test
	public void testBondRegex332() {
		assertTrue(!JamesBond.bondRegex("7("));
	}

	@Test
	public void testBondRegex333() {
		assertTrue(!JamesBond.bondRegex("7)"));
	}

	@Test
	public void testBondRegex334() {
		assertTrue(!JamesBond.bondRegex("7007)"));
	}

	@Test
	public void testBondRegex335() {
		assertTrue(!JamesBond.bondRegex("707)"));
	}

	@Test
	public void testBondRegex336() {
		assertTrue(!JamesBond.bondRegex("77)"));
	}

	@Test
	public void testBondRegex337() {
		assertTrue(!JamesBond.bondRegex("8("));
	}

	@Test
	public void testBondRegex338() {
		assertTrue(!JamesBond.bondRegex("8)"));
	}

	@Test
	public void testBondRegex339() {
		assertTrue(!JamesBond.bondRegex("8007)"));
	}

	@Test
	public void testBondRegex340() {
		assertTrue(!JamesBond.bondRegex("807)"));
	}

	@Test
	public void testBondRegex341() {
		assertTrue(!JamesBond.bondRegex("87)"));
	}

	@Test
	public void testBondRegex342() {
		assertTrue(!JamesBond.bondRegex("9("));
	}

	@Test
	public void testBondRegex343() {
		assertTrue(!JamesBond.bondRegex("9)"));
	}

	@Test
	public void testBondRegex344() {
		assertTrue(!JamesBond.bondRegex("9007)"));
	}

	@Test
	public void testBondRegex345() {
		assertTrue(!JamesBond.bondRegex("907)"));
	}

	@Test
	public void testBondRegex346() {
		assertTrue(!JamesBond.bondRegex("97)"));
	}



}
