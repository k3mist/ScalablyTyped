package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Claim extends js.Object {
  var claim: java.lang.String
  var matchType: java.lang.String
  var roleArn: java.lang.String
  var value: java.lang.String
}

object Anon_Claim {
  @scala.inline
  def apply(
    claim: java.lang.String,
    matchType: java.lang.String,
    roleArn: java.lang.String,
    value: java.lang.String
  ): Anon_Claim = {
    val __obj = js.Dynamic.literal(claim = claim, matchType = matchType, roleArn = roleArn, value = value)
  
    __obj.asInstanceOf[Anon_Claim]
  }
}

