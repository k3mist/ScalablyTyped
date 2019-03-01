package typings
package atPulumiAwsLib.ec2GetSecurityGroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecurityGroupsResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * IDs of the matches security groups.
    */
  val ids: js.Array[java.lang.String]
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The VPC IDs of the matched security groups. The data source's tag or filter *will span VPCs*
    * unless the `vpc-id` filter is also used.
    */
  val vpcIds: js.Array[java.lang.String]
}

object GetSecurityGroupsResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    ids: js.Array[java.lang.String],
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpcIds: js.Array[java.lang.String]
  ): GetSecurityGroupsResult = {
    val __obj = js.Dynamic.literal(id = id, ids = ids, tags = tags, vpcIds = vpcIds)
  
    __obj.asInstanceOf[GetSecurityGroupsResult]
  }
}

