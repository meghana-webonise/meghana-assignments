describe("is prime",function(){
	it("should be prime",function(){
		expect(isPrime(7)).toEqual(true)});

	it("should be prime",function(){
		expect(isPrime(16)).toEqual(true)});

	it("should not be prime",function(){
		expect(isPrime(6)).toEqual(false)});
});
