package typings
package atPulumiAwsLib.elasticsearchDomainPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainPolicyArgs extends js.Object {
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Name of the domain.
    */
  val domainName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

