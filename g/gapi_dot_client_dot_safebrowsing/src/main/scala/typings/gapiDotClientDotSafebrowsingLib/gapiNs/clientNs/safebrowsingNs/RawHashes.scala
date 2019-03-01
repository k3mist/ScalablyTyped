package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawHashes extends js.Object {
  /**
    * The number of bytes for each prefix encoded below.  This field can be
    * anywhere from 4 (shortest prefix) to 32 (full SHA256 hash).
    */
  var prefixSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The hashes, in binary format, concatenated into one long string. Hashes are
    * sorted in lexicographic order. For JSON API users, hashes are
    * base64-encoded.
    */
  var rawHashes: js.UndefOr[java.lang.String] = js.undefined
}

object RawHashes {
  @scala.inline
  def apply(prefixSize: scala.Int | scala.Double = null, rawHashes: java.lang.String = null): RawHashes = {
    val __obj = js.Dynamic.literal()
    if (prefixSize != null) __obj.updateDynamic("prefixSize")(prefixSize.asInstanceOf[js.Any])
    if (rawHashes != null) __obj.updateDynamic("rawHashes")(rawHashes)
    __obj.asInstanceOf[RawHashes]
  }
}

