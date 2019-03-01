package typings
package jestDashImageDashSnapshotLib.jestDashImageDashSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchImageSnapshotOptions extends js.Object {
  /**
    * Custom config passed to 'pixelmatch'
    */
  var customDiffConfig: js.UndefOr[PixelmatchOptions] = js.undefined
  /**
    * A custom absolute path of a directory to keep this diff in
    */
  var customDiffDir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A custom name to give this snapshot. If not provided, one is computed automatically.
    */
  var customSnapshotIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom snapshots directory.
    * Absolute path of a directory to keep the snapshot in.
    */
  var customSnapshotsDir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Changes diff image layout direction, default is horizontal.
    */
  var diffDirection: js.UndefOr[
    jestDashImageDashSnapshotLib.jestDashImageDashSnapshotLibStrings.horizontal | jestDashImageDashSnapshotLib.jestDashImageDashSnapshotLibStrings.vertical
  ] = js.undefined
  /**
    * Sets the threshold that would trigger a test failure based on the failureThresholdType selected. This is different
    * to the customDiffConfig.threshold above - the customDiffConfig.threshold is the per pixel failure threshold, whereas
    * this is the failure threshold for the entire comparison.
    * Defaults to 0.
    */
  var failureThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the type of threshold that would trigger a failure.
    * Defaults to 'pixel'.
    */
  var failureThresholdType: js.UndefOr[
    jestDashImageDashSnapshotLib.jestDashImageDashSnapshotLibStrings.pixel | jestDashImageDashSnapshotLib.jestDashImageDashSnapshotLibStrings.percent
  ] = js.undefined
  /**
    * Removes coloring from the console output, useful if storing the results to a file.
    * Defaults to false.
    */
  var noColors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Updates a snapshot even if it passed the threshold against the existing one, defaults to false.
    */
  var updatePassedSnapshot: js.UndefOr[scala.Boolean] = js.undefined
}

object MatchImageSnapshotOptions {
  @scala.inline
  def apply(
    customDiffConfig: PixelmatchOptions = null,
    customDiffDir: java.lang.String = null,
    customSnapshotIdentifier: java.lang.String = null,
    customSnapshotsDir: java.lang.String = null,
    diffDirection: jestDashImageDashSnapshotLib.jestDashImageDashSnapshotLibStrings.horizontal | jestDashImageDashSnapshotLib.jestDashImageDashSnapshotLibStrings.vertical = null,
    failureThreshold: scala.Int | scala.Double = null,
    failureThresholdType: jestDashImageDashSnapshotLib.jestDashImageDashSnapshotLibStrings.pixel | jestDashImageDashSnapshotLib.jestDashImageDashSnapshotLibStrings.percent = null,
    noColors: js.UndefOr[scala.Boolean] = js.undefined,
    updatePassedSnapshot: js.UndefOr[scala.Boolean] = js.undefined
  ): MatchImageSnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (customDiffConfig != null) __obj.updateDynamic("customDiffConfig")(customDiffConfig)
    if (customDiffDir != null) __obj.updateDynamic("customDiffDir")(customDiffDir)
    if (customSnapshotIdentifier != null) __obj.updateDynamic("customSnapshotIdentifier")(customSnapshotIdentifier)
    if (customSnapshotsDir != null) __obj.updateDynamic("customSnapshotsDir")(customSnapshotsDir)
    if (diffDirection != null) __obj.updateDynamic("diffDirection")(diffDirection.asInstanceOf[js.Any])
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (failureThresholdType != null) __obj.updateDynamic("failureThresholdType")(failureThresholdType.asInstanceOf[js.Any])
    if (!js.isUndefined(noColors)) __obj.updateDynamic("noColors")(noColors)
    if (!js.isUndefined(updatePassedSnapshot)) __obj.updateDynamic("updatePassedSnapshot")(updatePassedSnapshot)
    __obj.asInstanceOf[MatchImageSnapshotOptions]
  }
}

