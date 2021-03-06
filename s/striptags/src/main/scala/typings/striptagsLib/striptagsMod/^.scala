package typings
package striptagsLib.striptagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("striptags", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Creates an array of elements split into groups the length of size. If collection can’t be split evenly, the
    * final chunk will be the remaining elements.
    *
    * @param html The text to process.
    * @param allowedTags Tags which aren't removed
    * @param tagReplacement Removed tags are replaced with this
    * @return Returns the input string, sans any html tags that weren't allowed
    */
  def apply(html: java.lang.String): java.lang.String = js.native
  def apply(html: java.lang.String, allowedTags: java.lang.String | js.Array[java.lang.String]): java.lang.String = js.native
  def apply(
    html: java.lang.String,
    allowedTags: java.lang.String | js.Array[java.lang.String],
    tagReplacement: java.lang.String
  ): java.lang.String = js.native
  def init_streaming_mode(): js.Function1[/* html */ java.lang.String, java.lang.String] = js.native
  def init_streaming_mode(allowedTags: java.lang.String): js.Function1[/* html */ java.lang.String, java.lang.String] = js.native
  def init_streaming_mode(allowedTags: java.lang.String, tagReplacement: java.lang.String): js.Function1[/* html */ java.lang.String, java.lang.String] = js.native
  def init_streaming_mode(allowedTags: js.Array[java.lang.String]): js.Function1[/* html */ java.lang.String, java.lang.String] = js.native
  def init_streaming_mode(allowedTags: js.Array[java.lang.String], tagReplacement: java.lang.String): js.Function1[/* html */ java.lang.String, java.lang.String] = js.native
}

