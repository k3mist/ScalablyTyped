package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchBlobResponse extends js.Object {
  var data: js.Any
  var respInfo: RNFetchBlobResponseInfo
  var taskId: java.lang.String
  var `type`: rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.base64 | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.path | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.utf8
  /**
    * Return BASE64 string directly.
    * @return BASE64 string of response body.
    */
  def base64(): js.Any
  /**
    * Convert result to javascript RNFetchBlob object.
    * @return Return a promise resolves Blob object.
    */
  def blob(contentType: java.lang.String, sliceSize: scala.Double): js.Promise[PolyfillBlob]
  /**
    * Remove cahced file
    */
  def flush(): scala.Unit
  /**
    * Convert result to JSON object.
    * @return Parsed javascript object.
    */
  def json(): js.Any
  /**
    * get path of response temp file
    * @return File path of temp file.
    */
  def path(): java.lang.String
  /**
    * Read file content with given encoding, if the response does not contains
    * a file path, show warning message
    * @param  encode Encode type, should be one of `base64`, `ascrii`, `utf8`.
    */
  def readFile(encode: rnDashFetchDashBlobLib.Encoding): js.Promise[_] | scala.Null
  /**
    * Start read stream from cached file
    * @param  encode Encode type, should be one of `base64`, `ascrii`, `utf8`.
    */
  def readStream(encode: rnDashFetchDashBlobLib.Encoding): RNFetchBlobStream | scala.Null
  def session(name: java.lang.String): RNFetchBlobSession | scala.Null
  /**
    * Convert result to text.
    * @return Decoded base64 string.
    */
  def text(): java.lang.String | js.Promise[_]
}

object FetchBlobResponse {
  @scala.inline
  def apply(
    base64: js.Function0[js.Any],
    blob: js.Function2[java.lang.String, scala.Double, js.Promise[PolyfillBlob]],
    data: js.Any,
    flush: js.Function0[scala.Unit],
    json: js.Function0[js.Any],
    path: js.Function0[java.lang.String],
    readFile: js.Function1[rnDashFetchDashBlobLib.Encoding, js.Promise[_] | scala.Null],
    readStream: js.Function1[rnDashFetchDashBlobLib.Encoding, RNFetchBlobStream | scala.Null],
    respInfo: RNFetchBlobResponseInfo,
    session: js.Function1[java.lang.String, RNFetchBlobSession | scala.Null],
    taskId: java.lang.String,
    text: js.Function0[java.lang.String | js.Promise[_]],
    `type`: rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.base64 | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.path | rnDashFetchDashBlobLib.rnDashFetchDashBlobLibStrings.utf8
  ): FetchBlobResponse = {
    val __obj = js.Dynamic.literal(base64 = base64, blob = blob, data = data, flush = flush, json = json, path = path, readFile = readFile, readStream = readStream, respInfo = respInfo, session = session, taskId = taskId, text = text, `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FetchBlobResponse]
  }
}

