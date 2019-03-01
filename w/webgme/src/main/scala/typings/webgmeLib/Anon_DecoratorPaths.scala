package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DecoratorPaths extends js.Object {
  /**
    * Array of paths to decorators that should be available.
    * 
    * decoratorPaths = ['./src/client/decorators']
    */
  var decoratorPaths: js.Array[java.lang.String]
  /**
    * Array of decorators (by id) that should be downloaded from the
    *  server before the editor starts 
    * - when set to null all available decorators will be downloaded.
    */
  var decoratorToPreload: scala.Double | scala.Null
  /**
    * Array of paths (in the requirejs sense) to 
    * css files that should be loaded at start up. 
    * (To use this option a path would typically 
    * have to be added at config.requirejsPaths.)
    */
  var extraCss: js.Array[java.lang.String]
  /**
    * Specifies which layout to use 
    * (directory name must be present in any of the provided base-paths).
    * 
    */
  var layout: Anon_BasePathsDefault
  /**
    * Array of base paths that will be mapped from 'panels' in requirejs.
    * 
    * panelPaths = ['../src/client/js/Panels']
    */
  var panelPaths: js.Array[java.lang.String]
  /**
    * Array of paths to directories containing SVG-files 
    * that will be copied and made available as SVGs 
    * for decorators (ConstraintIcons is currently reserved).
    */
  var svgDirs: js.Array[java.lang.String]
  /**
    * Array of paths to json-files containing meta-data about the used visualizers.
    * 
    * visualizerDescriptors = ['../src/client/js/Visualizers.json']
    */
  var visualizerDescriptors: js.Array[java.lang.String]
}

object Anon_DecoratorPaths {
  @scala.inline
  def apply(
    decoratorPaths: js.Array[java.lang.String],
    extraCss: js.Array[java.lang.String],
    layout: Anon_BasePathsDefault,
    panelPaths: js.Array[java.lang.String],
    svgDirs: js.Array[java.lang.String],
    visualizerDescriptors: js.Array[java.lang.String],
    decoratorToPreload: scala.Int | scala.Double = null
  ): Anon_DecoratorPaths = {
    val __obj = js.Dynamic.literal(decoratorPaths = decoratorPaths, extraCss = extraCss, layout = layout, panelPaths = panelPaths, svgDirs = svgDirs, visualizerDescriptors = visualizerDescriptors)
    if (decoratorToPreload != null) __obj.updateDynamic("decoratorToPreload")(decoratorToPreload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DecoratorPaths]
  }
}

