package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketIncludeCookiesPrefix extends js.Object {
  var bucket: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var includeCookies: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_BucketIncludeCookiesPrefix {
  @scala.inline
  def apply(
    bucket: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    includeCookies: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    prefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_BucketIncludeCookiesPrefix = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    if (includeCookies != null) __obj.updateDynamic("includeCookies")(includeCookies.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketIncludeCookiesPrefix]
  }
}

