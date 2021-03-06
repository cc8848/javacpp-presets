// Targeted by JavaCPP version 1.4.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;

public class opencv_plot extends org.bytedeco.javacpp.presets.opencv_plot {
    static { Loader.load(); }

// Parsed from opencv2/plot.hpp

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009-2012, Willow Garage Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/
//################################################################################
//
//                    Created by Nuno Moutinho
//
//################################################################################

// #ifndef _OPENCV_PLOT_H_
// #define _OPENCV_PLOT_H_
// #ifdef __cplusplus

// #include <opencv2/core.hpp>

/**
\defgroup plot Plot function for Mat data
*/
    /** \addtogroup plot
     *  \{ */

        @Namespace("cv::plot") public static class Plot2d extends Algorithm {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public Plot2d(Pointer p) { super(p); }
        

            public native void setMinX(double _plotMinX);
            public native void setMinY(double _plotMinY);
            public native void setMaxX(double _plotMaxX);
            public native void setMaxY(double _plotMaxY);
            public native void setPlotLineWidth(int _plotLineWidth);
            /**
             * \brief Switches data visualization mode
             *
             * @param _needPlotLine if true then neighbour plot points will be connected by lines.
             * In other case data will be plotted as a set of standalone points.
             */
            public native void setNeedPlotLine(@Cast("bool") boolean _needPlotLine);
            public native void setPlotLineColor(@ByVal Scalar _plotLineColor);
            public native void setPlotBackgroundColor(@ByVal Scalar _plotBackgroundColor);
            public native void setPlotAxisColor(@ByVal Scalar _plotAxisColor);
            public native void setPlotGridColor(@ByVal Scalar _plotGridColor);
            public native void setPlotTextColor(@ByVal Scalar _plotTextColor);
            public native void setPlotSize(int _plotSizeWidth, int _plotSizeHeight);
            public native void setShowGrid(@Cast("bool") boolean needShowGrid);
            public native void setShowText(@Cast("bool") boolean needShowText);
            public native void setGridLinesNumber(int gridLinesNumber);
            public native void setInvertOrientation(@Cast("bool") boolean _invertOrientation);
            /**
             * \brief Sets the index of a point which coordinates will be printed on the top left corner of the plot (if ShowText flag is true).
             *
             * @param pointIdx index of the required point in data array.
             */
            public native void setPointIdxToPrint(int pointIdx);
            public native void render(@ByVal Mat _plotResult);
            public native void render(@ByVal UMat _plotResult);
            public native void render(@ByVal GpuMat _plotResult);

            /**
             * \brief Creates Plot2d object
             *
             * @param data \f$1xN\f$ or \f$Nx1\f$ matrix containing \f$Y\f$ values of points to plot. \f$X\f$ values
             * will be equal to indexes of correspondind elements in data matrix.
             */
            public static native @Ptr Plot2d create(@ByVal Mat data);
            public static native @Ptr Plot2d create(@ByVal UMat data);
            public static native @Ptr Plot2d create(@ByVal GpuMat data);

            /**
             * \brief Creates Plot2d object
             *
             * @param dataX \f$1xN\f$ or \f$Nx1\f$ matrix \f$X\f$ values of points to plot.
             * @param dataY \f$1xN\f$ or \f$Nx1\f$ matrix containing \f$Y\f$ values of points to plot.
             */
            public static native @Ptr Plot2d create(@ByVal Mat dataX, @ByVal Mat dataY);
            public static native @Ptr Plot2d create(@ByVal UMat dataX, @ByVal UMat dataY);
            public static native @Ptr Plot2d create(@ByVal GpuMat dataX, @ByVal GpuMat dataY);
        }
    /** \} */
    


// #endif
// #endif


}
