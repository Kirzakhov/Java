package mypack;


enum Practice {
	RED {
		@Override
		String colorInfo() {
			// TODO Auto-generated method stub
			return "Danger";
		}
	},
	GREEN {
		@Override
		String colorInfo() {
			// TODO Auto-generated method stub
			return "Success";
		}
	},
	BLUE {
		@Override
		String colorInfo() {
			// TODO Auto-generated method stub
			return "Primary";
		}
	};
	
	private Practice() {
		System.out.println("Constructor called for " + this.toString());
	}
	abstract String colorInfo();

	public static void main(String[] args) {
		Practice[] arr = Practice.values();
		for(Practice p : arr) {
			System.out.println(p +" at index " + p.ordinal());
			System.out.println(p.colorInfo());
		}
//		Practice p1 = Practice.GREEN;
	}

}
