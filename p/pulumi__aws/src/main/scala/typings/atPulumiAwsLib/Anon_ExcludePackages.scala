package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludePackages extends js.Object {
  /**
    * The packages relative to the program folder to not include the Lambda upload. This can be
    * used to override the default serialization logic that includes all packages referenced by
    * project.json (except @pulumi packages).  Default is `[]`.
    *
    * @deprecated Use [codePathOptions] instead.
    */
  var excludePackages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * @deprecated use [callbackFactory] instead.
    */
  var factoryFunc: js.UndefOr[atPulumiAwsLib.serverlessFunctionMod.HandlerFactory] = js.undefined
  /**
    * @deprecated use [callback] instead.
    */
  var func: js.UndefOr[atPulumiAwsLib.serverlessFunctionMod.Handler] = js.undefined
  /**
    * The packages relative to the program folder to include in the Lambda upload.  The version of
    * the package installed in the program folder and it's dependencies will all be included.
    * Default is `[]`.
    *
    * @deprecated Use [codePathOptions] instead.
    */
  var includePackages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The paths relative to the program folder to include in the Lambda upload.  Default is `[]`.
    *
    * @deprecated Use [codePathOptions] instead.
    */
  var includePaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_ExcludePackages {
  @scala.inline
  def apply(
    excludePackages: js.Array[java.lang.String] = null,
    factoryFunc: atPulumiAwsLib.serverlessFunctionMod.HandlerFactory = null,
    func: atPulumiAwsLib.serverlessFunctionMod.Handler = null,
    includePackages: js.Array[java.lang.String] = null,
    includePaths: js.Array[java.lang.String] = null
  ): Anon_ExcludePackages = {
    val __obj = js.Dynamic.literal()
    if (excludePackages != null) __obj.updateDynamic("excludePackages")(excludePackages)
    if (factoryFunc != null) __obj.updateDynamic("factoryFunc")(factoryFunc)
    if (func != null) __obj.updateDynamic("func")(func)
    if (includePackages != null) __obj.updateDynamic("includePackages")(includePackages)
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths)
    __obj.asInstanceOf[Anon_ExcludePackages]
  }
}

