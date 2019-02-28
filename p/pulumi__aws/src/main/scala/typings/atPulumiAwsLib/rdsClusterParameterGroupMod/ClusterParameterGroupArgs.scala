package typings
package atPulumiAwsLib.rdsClusterParameterGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterParameterGroupArgs extends js.Object {
  /**
    * The description of the DB cluster parameter group. Defaults to "Managed by Terraform".
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The family of the DB cluster parameter group.
    */
  val family: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name of the DB parameter.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group.
    */
  val parameters: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ApplyMethodName]]
    ]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

