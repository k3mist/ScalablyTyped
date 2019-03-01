package typings
package atPulumiAwsLib.ec2GetSecurityGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecurityGroupResult extends js.Object {
  /**
    * The computed ARN of the security group.
    */
  val arn: java.lang.String
  /**
    * The description of the security group.
    */
  val description: java.lang.String
  val id: java.lang.String
  val name: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: java.lang.String
}

object GetSecurityGroupResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpcId: java.lang.String
  ): GetSecurityGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn, description = description, id = id, name = name, tags = tags, vpcId = vpcId)
  
    __obj.asInstanceOf[GetSecurityGroupResult]
  }
}

