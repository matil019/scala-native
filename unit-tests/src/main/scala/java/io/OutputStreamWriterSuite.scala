package java.io

object OutputStreamWriterSuite extends tests.Suite {
  test(
    "Instantiating OutputStreamWriter with an invalid charsetName throws UnsupportedEncodingException") {
    assertThrows[UnsupportedEncodingException](
      new OutputStreamWriter(new ByteArrayOutputStream, "nonexistent-charset"))
  }
}
