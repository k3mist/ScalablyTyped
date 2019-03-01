package typings
package appDashBuilderDashLibLib.outOptionsPkgOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PkgOptions
  extends appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions {
  /**
    * Whether can be installed at the root of any volume, including non-system volumes. Otherwise, it cannot be installed at the root of a volume.
    *
    * Corresponds to [enable_anywhere](https://developer.apple.com/library/content/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW70).
    * @default true
    */
  val allowAnywhere: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Whether can be installed into the current user’s home directory.
    * A home directory installation is done as the current user (not as root), and it cannot write outside of the home directory.
    * If the product cannot be installed in the user’s home directory and be not completely functional from user’s home directory.
    *
    * Corresponds to [enable_currentUserHome](https://developer.apple.com/library/content/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW70).
    * @default true
    */
  val allowCurrentUserHome: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Whether can be installed into the root directory. Should usually be `true` unless the product can be installed only to the user’s home directory.
    *
    * Corresponds to [enable_localSystem](https://developer.apple.com/library/content/documentation/DeveloperTools/Reference/DistributionDefinitionRef/Chapters/Distribution_XML_Ref.html#//apple_ref/doc/uid/TP40005370-CH100-SW70).
    * @default true
    */
  val allowRootDirectory: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Options for the background image for the installer.
    */
  val background: js.UndefOr[PkgBackgroundOptions | scala.Null] = js.undefined
  /**
    * The path to the conclusion file. This may be used to customize the text on the final "Summary" page of the installer.
    */
  val conclusion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Require identical bundle identifiers at install path?
    * @default true
    */
  val hasStrictIdentifier: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * The name of certificate to use when signing. Consider using environment variables [CSC_LINK or CSC_NAME](/code-signing) instead of specifying this option.
    */
  val identity: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The install location. [Do not use it](https://stackoverflow.com/questions/12863944/how-do-you-specify-a-default-install-location-to-home-with-pkgbuild) to create per-user package.
    * Mostly never you will need to change this option. `/Applications` would install it as expected into `/Applications` if the local system domain is chosen, or into `$HOME/Applications` if the home installation is chosen.
    * @default /Applications
    */
  val installLocation: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Install bundle over previous version if moved by user?
    * @default true
    */
  val isRelocatable: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Don't install bundle if newer version on disk?
    * @default true
    */
  val isVersionChecked: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). In addition to `txt, `rtf` and `html` supported (don't forget to use `target="_blank"` for links).
    */
  val license: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Specifies how an existing version of the bundle on disk should be handled when the version in
    * the package is installed.
    *
    * If you specify upgrade, the bundle in the package atomi-cally replaces any version on disk;
    * this has the effect of deleting old paths that no longer exist in the new version of
    * the bundle.
    *
    * If you specify update, the bundle in the package overwrites the version on disk, and any files
    * not contained in the package will be left intact; this is appropriate when you are delivering
    * an update-only package.
    *
    * Another effect of update is that the package bundle will not be installed at all if there is
    * not already a version on disk; this allows a package to deliver an update for an app that
    * the user might have deleted.
    *
    * @default upgrade
    */
  val overwriteAction: js.UndefOr[
    appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.upgrade | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.update | scala.Null
  ] = js.undefined
  /**
    * should be not documented, only to experiment
    * @private
    */
  val productbuild: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
    * The scripts directory, relative to `build` (build resources directory).
    * The scripts can be in any language so long as the files are marked executable and have the appropriate shebang indicating the path to the interpreter.
    * Scripts are required to be executable (`chmod +x file`).
    * @default build/pkg-scripts
    * @see [Scripting in installer packages](http://macinstallers.blogspot.de/2012/07/scripting-in-installer-packages.html).
    */
  val scripts: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The path to the welcome file. This may be used to customize the text on the Introduction page of the installer.
    */
  val welcome: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object PkgOptions {
  @scala.inline
  def apply(
    allowAnywhere: js.UndefOr[scala.Boolean] = js.undefined,
    allowCurrentUserHome: js.UndefOr[scala.Boolean] = js.undefined,
    allowRootDirectory: js.UndefOr[scala.Boolean] = js.undefined,
    artifactName: java.lang.String = null,
    background: PkgBackgroundOptions = null,
    conclusion: java.lang.String = null,
    hasStrictIdentifier: js.UndefOr[scala.Boolean] = js.undefined,
    identity: java.lang.String = null,
    installLocation: java.lang.String = null,
    isRelocatable: js.UndefOr[scala.Boolean] = js.undefined,
    isVersionChecked: js.UndefOr[scala.Boolean] = js.undefined,
    license: java.lang.String = null,
    overwriteAction: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.upgrade | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.update = null,
    productbuild: js.Array[java.lang.String] = null,
    publish: builderDashUtilDashRuntimeLib.outPublishOptionsMod.Publish = null,
    scripts: java.lang.String = null,
    welcome: java.lang.String = null
  ): PkgOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAnywhere)) __obj.updateDynamic("allowAnywhere")(allowAnywhere)
    if (!js.isUndefined(allowCurrentUserHome)) __obj.updateDynamic("allowCurrentUserHome")(allowCurrentUserHome)
    if (!js.isUndefined(allowRootDirectory)) __obj.updateDynamic("allowRootDirectory")(allowRootDirectory)
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (background != null) __obj.updateDynamic("background")(background)
    if (conclusion != null) __obj.updateDynamic("conclusion")(conclusion)
    if (!js.isUndefined(hasStrictIdentifier)) __obj.updateDynamic("hasStrictIdentifier")(hasStrictIdentifier)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (installLocation != null) __obj.updateDynamic("installLocation")(installLocation)
    if (!js.isUndefined(isRelocatable)) __obj.updateDynamic("isRelocatable")(isRelocatable)
    if (!js.isUndefined(isVersionChecked)) __obj.updateDynamic("isVersionChecked")(isVersionChecked)
    if (license != null) __obj.updateDynamic("license")(license)
    if (overwriteAction != null) __obj.updateDynamic("overwriteAction")(overwriteAction.asInstanceOf[js.Any])
    if (productbuild != null) __obj.updateDynamic("productbuild")(productbuild)
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    if (welcome != null) __obj.updateDynamic("welcome")(welcome)
    __obj.asInstanceOf[PkgOptions]
  }
}

