
package org.scalablytyped.sbt

import sbt._
import sbt.Keys._

object ScalablyTypedPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = sbt.plugins.JvmPlugin

  object autoImport {
    object ScalablyTyped {
      object A {
        val angular__common = "org.scalablytyped" % "angular__common_sjs0.6_2.12" % "7.2.6-209aa6"
        val angular__compiler = "org.scalablytyped" % "angular__compiler_sjs0.6_2.12" % "7.2.6-a5cbc4"
        val angular__core = "org.scalablytyped" % "angular__core_sjs0.6_2.12" % "7.2.6-2e6aba"
        val angular__forms = "org.scalablytyped" % "angular__forms_sjs0.6_2.12" % "7.2.6-9261fe"
        val `angular__platform-browser` = "org.scalablytyped" % "angular__platform-browser_sjs0.6_2.12" % "7.2.6-5e08b5"
        val `angular__platform-browser-dynamic` = "org.scalablytyped" % "angular__platform-browser-dynamic_sjs0.6_2.12" % "7.2.6-10e03c"
        val angular__router = "org.scalablytyped" % "angular__router_sjs0.6_2.12" % "7.2.6-be0adc"
        val axios = "org.scalablytyped" % "axios_sjs0.6_2.12" % "0.18.0-7e5f25"
      }
      object B {
        val `body-parser` = "org.scalablytyped" % "body-parser_sjs0.6_2.12" % "1.17-dt-20180425Z-17a4a6"
      }
      object C {
        val chart_dot_js = "org.scalablytyped" % "chart_dot_js_sjs0.6_2.12" % "2.7-dt-20190212Z-e02d4c"
        val classnames = "org.scalablytyped" % "classnames_sjs0.6_2.12" % "2.2-dt-20181230Z-47ee71"
        val connect = "org.scalablytyped" % "connect_sjs0.6_2.12" % "v3.4.0-dt-20180417Z-95a423"
        val `core-js` = "org.scalablytyped" % "core-js_sjs0.6_2.12" % "2.5-dt-20180921Z-e35e46"
        val csstype = "org.scalablytyped" % "csstype_sjs0.6_2.12" % "2.6.2-1a329a"
      }
      object D {
        val d3 = "org.scalablytyped" % "d3_sjs0.6_2.12" % "5.7-dt-20190212Z-159cc0"
        val `d3-array` = "org.scalablytyped" % "d3-array_sjs0.6_2.12" % "1.2-dt-20190221Z-56f8cc"
        val `d3-axis` = "org.scalablytyped" % "d3-axis_sjs0.6_2.12" % "1.0-dt-20190212Z-8adefe"
        val `d3-brush` = "org.scalablytyped" % "d3-brush_sjs0.6_2.12" % "1.0-dt-20190212Z-a0fe87"
        val `d3-chord` = "org.scalablytyped" % "d3-chord_sjs0.6_2.12" % "1.0-dt-20190212Z-097b3a"
        val `d3-collection` = "org.scalablytyped" % "d3-collection_sjs0.6_2.12" % "1.0-dt-20190212Z-a57929"
        val `d3-color` = "org.scalablytyped" % "d3-color_sjs0.6_2.12" % "1.2-dt-20190212Z-7228cd"
        val `d3-contour` = "org.scalablytyped" % "d3-contour_sjs0.6_2.12" % "1.3-dt-20190205Z-c92918"
        val `d3-dispatch` = "org.scalablytyped" % "d3-dispatch_sjs0.6_2.12" % "1.0-dt-20190212Z-d8be4d"
        val `d3-drag` = "org.scalablytyped" % "d3-drag_sjs0.6_2.12" % "1.2-dt-20190212Z-e8cba8"
        val `d3-dsv` = "org.scalablytyped" % "d3-dsv_sjs0.6_2.12" % "1.0-dt-20190212Z-f3c04d"
        val `d3-ease` = "org.scalablytyped" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20190212Z-2299a0"
        val `d3-fetch` = "org.scalablytyped" % "d3-fetch_sjs0.6_2.12" % "1.1-dt-20181228Z-05810c"
        val `d3-force` = "org.scalablytyped" % "d3-force_sjs0.6_2.12" % "1.2-dt-20190212Z-9758d8"
        val `d3-format` = "org.scalablytyped" % "d3-format_sjs0.6_2.12" % "1.3-dt-20190212Z-622a9b"
        val `d3-geo` = "org.scalablytyped" % "d3-geo_sjs0.6_2.12" % "1.11-dt-20190212Z-e126eb"
        val `d3-hierarchy` = "org.scalablytyped" % "d3-hierarchy_sjs0.6_2.12" % "1.1-dt-20190212Z-138107"
        val `d3-interpolate` = "org.scalablytyped" % "d3-interpolate_sjs0.6_2.12" % "1.3-dt-20190212Z-fde5fd"
        val `d3-path` = "org.scalablytyped" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-951458"
        val `d3-polygon` = "org.scalablytyped" % "d3-polygon_sjs0.6_2.12" % "1.0-dt-20190212Z-6f48b7"
        val `d3-quadtree` = "org.scalablytyped" % "d3-quadtree_sjs0.6_2.12" % "1.0-dt-20190212Z-2e9fb1"
        val `d3-random` = "org.scalablytyped" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-6fab73"
        val `d3-scale` = "org.scalablytyped" % "d3-scale_sjs0.6_2.12" % "2.1-dt-20190212Z-90ff34"
        val `d3-scale-chromatic` = "org.scalablytyped" % "d3-scale-chromatic_sjs0.6_2.12" % "1.3-dt-20190212Z-bdca1b"
        val `d3-selection` = "org.scalablytyped" % "d3-selection_sjs0.6_2.12" % "1.4-dt-20190212Z-b898c9"
        val `d3-shape` = "org.scalablytyped" % "d3-shape_sjs0.6_2.12" % "1.3-dt-20190212Z-8ac6df"
        val `d3-time` = "org.scalablytyped" % "d3-time_sjs0.6_2.12" % "1.0-dt-20190212Z-d1315b"
        val `d3-time-format` = "org.scalablytyped" % "d3-time-format_sjs0.6_2.12" % "2.1-dt-20190212Z-4d42f4"
        val `d3-timer` = "org.scalablytyped" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-f316ea"
        val `d3-transition` = "org.scalablytyped" % "d3-transition_sjs0.6_2.12" % "1.1-dt-20190212Z-94431d"
        val `d3-voronoi` = "org.scalablytyped" % "d3-voronoi_sjs0.6_2.12" % "1.1-dt-20190212Z-779237"
        val `d3-zoom` = "org.scalablytyped" % "d3-zoom_sjs0.6_2.12" % "1.7-dt-20190212Z-f484fd"
      }
      object E {
        val electron = "org.scalablytyped" % "electron_sjs0.6_2.12" % "4.0.5-af3a73"
        val exenv = "org.scalablytyped" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-297b87"
        val express = "org.scalablytyped" % "express_sjs0.6_2.12" % "4.16-dt-20190122Z-7cc9b6"
        val `express-serve-static-core` = "org.scalablytyped" % "express-serve-static-core_sjs0.6_2.12" % "4.16-dt-20190122Z-53ef34"
        val `extract-zip` = "org.scalablytyped" % "extract-zip_sjs0.6_2.12" % "1.6-dt-20180214Z-71cc92"
      }
      object G {
        val geojson = "org.scalablytyped" % "geojson_sjs0.6_2.12" % "7946.0-dt-20190212Z-ff9513"
        val googlemaps = "org.scalablytyped" % "googlemaps_sjs0.6_2.12" % "3.30-dt-20181022Z-af71cf"
      }
      object H {
        val highlight_dot_js = "org.scalablytyped" % "highlight_dot_js_sjs0.6_2.12" % "v9.12-dt-20180214Z-679701"
        val `hoist-non-react-statics` = "org.scalablytyped" % "hoist-non-react-statics_sjs0.6_2.12" % "3.0-dt-20180806Z-752d71"
      }
      object I {
        val `is-buffer` = "org.scalablytyped" % "is-buffer_sjs0.6_2.12" % "2.0-dt-20181210Z-6702fa"
      }
      object J {
        val jquery = "org.scalablytyped" % "jquery_sjs0.6_2.12" % "3.3-dt-20190108Z-cd35b1"
        val jqueryui = "org.scalablytyped" % "jqueryui_sjs0.6_2.12" % "1.12-dt-20190124Z-19c2b0"
      }
      object L {
        val lodash = "org.scalablytyped" % "lodash_sjs0.6_2.12" % "4.14-dt-20190227Z-8384c5"
      }
      object M {
        val `material-ui` = "org.scalablytyped" % "material-ui_sjs0.6_2.12" % "0.21-dt-20190225Z-6c08e6"
        val mime = "org.scalablytyped" % "mime_sjs0.6_2.12" % "2.0-dt-20190205Z-5ddd77"
        val mobx = "org.scalablytyped" % "mobx_sjs0.6_2.12" % "5.9.0-611a38"
        val `mobx-react` = "org.scalablytyped" % "mobx-react_sjs0.6_2.12" % "5.4.3-0e1ffa"
        val moment = "org.scalablytyped" % "moment_sjs0.6_2.12" % "2.24.0-d9948a"
      }
      object N {
        val node = "org.scalablytyped" % "node_sjs0.6_2.12" % "11.10-dt-20190228Z-d611ff"
      }
      object P {
        val `prop-types` = "org.scalablytyped" % "prop-types_sjs0.6_2.12" % "15.7-dt-20190226Z-a0043b"
      }
      object R {
        val `range-parser` = "org.scalablytyped" % "range-parser_sjs0.6_2.12" % "1.2-dt-20181016Z-183f08"
        val react = "org.scalablytyped" % "react_sjs0.6_2.12" % "16.8-dt-20190226Z-ff5ee1"
        val `react-addons-linked-state-mixin` = "org.scalablytyped" % "react-addons-linked-state-mixin_sjs0.6_2.12" % "0.14-dt-20180806Z-a40ae3"
        val `react-big-calendar` = "org.scalablytyped" % "react-big-calendar_sjs0.6_2.12" % "0.20-dt-20190225Z-41ebd7"
        val `react-contrib` = "org.scalablytyped" % "react-contrib_sjs0.6_2.12" % "201903030253-84b7ab"
        val `react-dom` = "org.scalablytyped" % "react-dom_sjs0.6_2.12" % "16.8-dt-20190213Z-1fd150"
        val `react-is` = "org.scalablytyped" % "react-is_sjs0.6_2.12" % "16.7-dt-20190212Z-fc56c0"
        val `react-japgolly-contrib` = "org.scalablytyped" % "react-japgolly-contrib_sjs0.6_2.12" % "201901111236-72504e"
        val `react-lifecycles-compat` = "org.scalablytyped" % "react-lifecycles-compat_sjs0.6_2.12" % "3.0-dt-20190116Z-90843c"
        val `react-native` = "org.scalablytyped" % "react-native_sjs0.6_2.12" % "0.57-dt-20190221Z-f0aa24"
        val `react-native-vector-icons` = "org.scalablytyped" % "react-native-vector-icons_sjs0.6_2.12" % "4.6-dt-20181108Z-6d1829"
        val `react-navigation` = "org.scalablytyped" % "react-navigation_sjs0.6_2.12" % "3.0-dt-20190224Z-9cf07d"
        val `react-redux` = "org.scalablytyped" % "react-redux_sjs0.6_2.12" % "7.0-dt-20190124Z-0e6fe9"
        val `react-redux-contrib` = "org.scalablytyped" % "react-redux-contrib_sjs0.6_2.12" % "201901111200-b30925"
        val `react-slick` = "org.scalablytyped" % "react-slick_sjs0.6_2.12" % "0.23-dt-20190126Z-bedecf"
        val redux = "org.scalablytyped" % "redux_sjs0.6_2.12" % "4.0.1-c5cabe"
        val `redux-devtools-extension` = "org.scalablytyped" % "redux-devtools-extension_sjs0.6_2.12" % "2.13.8-2bd1dd"
        val reveal = "org.scalablytyped" % "reveal_sjs0.6_2.12" % "3.3.0-dt-20180214Z-94f058"
        val rxjs = "org.scalablytyped" % "rxjs_sjs0.6_2.12" % "6.4.0-6ca980"
      }
      object S {
        val `semantic-ui-react` = "org.scalablytyped" % "semantic-ui-react_sjs0.6_2.12" % "0.85.0-99a1fe"
        val `semantic-ui-react__event-stack` = "org.scalablytyped" % "semantic-ui-react__event-stack_sjs0.6_2.12" % "3.0.1-74b48a"
        val `serve-static` = "org.scalablytyped" % "serve-static_sjs0.6_2.12" % "1.13-dt-20180428Z-83c3c1"
        val shallowequal = "org.scalablytyped" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-d83b66"
        val sizzle = "org.scalablytyped" % "sizzle_sjs0.6_2.12" % "2.3-dt-20181006Z-321b5d"
        val std = "org.scalablytyped" % "std_sjs0.6_2.12" % "3.3-8d1cc2"
        val `std-contrib` = "org.scalablytyped" % "std-contrib_sjs0.6_2.12" % "201901071005-b2b288"
        val storybook__react = "org.scalablytyped" % "storybook__react_sjs0.6_2.12" % "4.0-dt-20190213Z-2a2a7e"
        val `symbol-observable` = "org.scalablytyped" % "symbol-observable_sjs0.6_2.12" % "1.2.0-9401e9"
      }
      object T {
        val three = "org.scalablytyped" % "three_sjs0.6_2.12" % "0.93-dt-20190227Z-7671c1"
        val tslib = "org.scalablytyped" % "tslib_sjs0.6_2.12" % "1.9.3-2ec86f"
        val typescript = "org.scalablytyped" % "typescript_sjs0.6_2.12" % "3.3.3-ec7374"
      }
      object V {
        val vue = "org.scalablytyped" % "vue_sjs0.6_2.12" % "2.6.6-d39946"
      }
      object W {
        val `webpack-env` = "org.scalablytyped" % "webpack-env_sjs0.6_2.12" % "1.13-dt-20190216Z-887902"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped" % "zone_dot_js_sjs0.6_2.12" % "0.8.29-3be1b9"
      }
    }
  }
}