package typings
package atPulumiAwsLib.codecommitRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryArgs extends js.Object {
  /**
    * The default branch of the repository. The branch specified here needs to exist.
    */
  val defaultBranch: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The description of the repository. This needs to be less than 1000 characters
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object RepositoryArgs {
  @scala.inline
  def apply(
    repositoryName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    defaultBranch: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): RepositoryArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    if (defaultBranch != null) __obj.updateDynamic("defaultBranch")(defaultBranch.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryArgs]
  }
}

