package problems1000.problems100.problems20.problem17;

public enum NumberLetters {
	
	N1(3),
	N2(2),
	N3(5),
	N4(4),
	N5(4),
	N6(3),
	N7(5),
	N8(5),
	N9(4),
	N10(3),
	N11(6),
	N12(6),
	N13(8),
	N14(8),
	N15(7),
	N16(7),
	N17(9),
	N18(8),
	N19(8),
	N20(6),
	N30(6),
	N40(6),
	N50(5),
	N60(5),
	N70(7),
	N80(7),
	N90(6),
	N100(7),
	N1000(8);
	
	
	private Integer code;
	
	public Integer getCode() {
		return this.code;
	}
	
	private NumberLetters(Integer code) {
		this.code = code;
	}

}
