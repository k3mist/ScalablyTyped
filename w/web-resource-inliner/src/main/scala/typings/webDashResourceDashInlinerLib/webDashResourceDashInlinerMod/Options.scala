package typings
package webDashResourceDashInlinerLib.webDashResourceDashInlinerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * This is the HTML or CSS content to be inlined, you should provide HTML to the html() method and CSS to the css() method or you will get errors or garbage output.
    */
  var fileContent: java.lang.String
  /**
    * When true, inline images unless they have an exclusion attribute (see inlineAttribute option).
    *
    * When false, exclude images unless they have an inclusion attribute (see inlineAttribute option).
    *
    * When a number, inline images only when the base64 content size is less than the number of KBs.
    *
    * For example, the default is to only inline images less than 8KB.
    *
    * @default 8
    */
  var images: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Sets the attribute that is used to include/exclude specific resources based on the default behavior for the resource type.
    *
    * For example, if scripts is set to false, an individual script can be inlined by adding the attribute to the script tag like <script src="myscript.js" data-inline></script>.
    * On the other hand, if images are set to be inlined by default,
    * a specific image can be excluded by adding -ignore to the end of the inlineAttribute like <img src="myimg.png" data-inline-ignore />.
    *
    * In CSS, a comment is required at the end of the line to perform the same thing, such as \/ *data-inline*\/ or \/ *data-inline-ignore*\/.
    *
    * @default "data-inline"
    */
  var inlineAttribute: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows to make changes to links before they are inlined, such as CSS pre-and-post-processors.
    *
    * Callback is standard node error first, second argument is transformed value.
    */
  var linkTransform: js.UndefOr[js.Function2[/* content */ java.lang.String, /* done */ Callback, _]] = js.undefined
  /**
    * When true, inline stylesheet links unless they have an exclusion attribute (see inlineAttribute option).
    *
    * When false, exclude stylesheet links unless they have an inclusion attribute (see inlineAttribute option).
    *
    * When a number, inline stylesheet links only when the base64 content size is less than the number of KBs.
    *
    * @default true
    */
  var links: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Describes the path relationship between CSS content and the context it will be loaded in.
    *
    * For example, when a CSS file contains url(some-file.png) and the file is moved from a location in a folder like /css to /
    * then the path to the image needs to be changed to url(css/some-file.png).
    * In this case, rebaseRelativeTo would be css. You probably don't want to set this when you are using html().
    *
    * @default ""
    */
  var rebaseRelativeTo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Describes the path relationship between where web-resource-inliner is running and what the relative paths in fileContent or href/src urls refer to.
    *
    * For example, the tests cases in this package are in test/cases/ so their relative paths start by referring to that folder,
    * but the root of this project and where npm test runs from is 2 folders up, so relativeTo is set to test/cases/ in test/spec.js.
    * Likewise, with href="content.css" and a relativeTo of http://github.com/ the resource retrieved would be http://github.com/content.css.
    *
    * @default ""
    */
  var relativeTo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows to adjust issued requests.
    *
    * E.g., add authentication tokens to requested URLs.
    *
    * The function is called with the request options object as its parameter.
    *
    * It can modify this object or return a new one.
    *
    * See the [list of available options](https://www.npmjs.com/package/request#request-options-callback).
    */
  var requestTransform: js.UndefOr[
    js.Function1[
      /* requestOptions */ requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions, 
      requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions
    ]
  ] = js.undefined
  /**
    * Allows to make changes to scripts before they are inlined, such as minifying.
    *
    * Callback is standard node error first, second argument is transformed value.
    */
  var scriptTransform: js.UndefOr[js.Function2[/* content */ java.lang.String, /* done */ Callback, _]] = js.undefined
  /**
    * When true, inline scripts unless they have an exclusion attribute (see inlineAttribute option).
    *
    * When false, exclude scripts unless they have an inclusion attribute (see inlineAttribute option).
    *
    * When a number, inline scripts only when the base64 content size is less than the number of KBs.
    *
    * @default true
    */
  var scripts: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * When strict is true, a missing resource will cause the inliner to halt and return an error in the callback.
    *
    * The default behavior is to log a warning to the console and continue inlining with the available resources, which is more similar to how a web page behaves.
    *
    * @default false
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When true, inline SVG <use> unless they have an exclusion attribute (see inlineAttribute option).
    *
    * When false, exclude SVG <use> unless they have an inclusion attribute (see inlineAttribute option).
    *
    * When a number, inline SVG <use> only when the content size is less than the number of KBs.
    *
    * For example, the default is to only inline SVGs less than 8KB.
    *
    * @default 8
    */
  var svgs: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fileContent: java.lang.String,
    images: scala.Boolean | scala.Double = null,
    inlineAttribute: java.lang.String = null,
    linkTransform: js.Function2[/* content */ java.lang.String, /* done */ Callback, _] = null,
    links: scala.Boolean | scala.Double = null,
    rebaseRelativeTo: java.lang.String = null,
    relativeTo: java.lang.String = null,
    requestTransform: js.Function1[
      /* requestOptions */ requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions, 
      requestLib.requestMod.requestNs.RequiredUriUrl with requestLib.requestMod.requestNs.CoreOptions
    ] = null,
    scriptTransform: js.Function2[/* content */ java.lang.String, /* done */ Callback, _] = null,
    scripts: scala.Boolean | scala.Double = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    svgs: scala.Boolean | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(fileContent = fileContent)
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (inlineAttribute != null) __obj.updateDynamic("inlineAttribute")(inlineAttribute)
    if (linkTransform != null) __obj.updateDynamic("linkTransform")(linkTransform)
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (rebaseRelativeTo != null) __obj.updateDynamic("rebaseRelativeTo")(rebaseRelativeTo)
    if (relativeTo != null) __obj.updateDynamic("relativeTo")(relativeTo)
    if (requestTransform != null) __obj.updateDynamic("requestTransform")(requestTransform)
    if (scriptTransform != null) __obj.updateDynamic("scriptTransform")(scriptTransform)
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (svgs != null) __obj.updateDynamic("svgs")(svgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

