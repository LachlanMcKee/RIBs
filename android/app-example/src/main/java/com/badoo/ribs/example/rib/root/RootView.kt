package com.badoo.ribs.example.rib.root

import android.support.annotation.LayoutRes
import android.view.ViewGroup
//import com.badoo.ribs.android.AndroidPortalRenderer
import com.badoo.ribs.core.Portal
import com.badoo.ribs.core.view.RibView
import com.badoo.ribs.core.view.ViewFactory
import com.badoo.ribs.example.R
//import com.badoo.ribs.example.rib.root.RootView.Event
import com.jakewharton.rxrelay2.PublishRelay
import io.reactivex.ObservableSource
import io.reactivex.functions.Consumer

//interface RootView : RibView,
//    ObservableSource<Event>
////    ,
////    Portal.Renderer
//{
////    ,
////    Consumer<ViewModel> {
//
//    sealed class Event
//
////    data class ViewModel(
////        val i: Int = 0
////    )
//
//    interface Factory : ViewFactory<Nothing?, RootView>
//
////    val portalRenderer: Portal.Renderer
//}
//
//
//class RootViewImpl private constructor(
//    override val androidView: ViewGroup,
//    private val events: PublishRelay<Event> = PublishRelay.create()
//) : RootView,
//    ObservableSource<Event> by events
////    ,
////    Portal.Renderer
//{
////    Consumer<ViewModel> {
//
////    class Factory(
////        @LayoutRes private val layoutRes: Int = R.layout.rib_root
////    ) : RootView.Factory {
////        override fun invoke(deps: Nothing?): (ViewGroup) -> Nothing = {
////            RootViewImpl(
////                com.badoo.ribs.customisation.inflate(it, layoutRes)
////            )
////        }
////    }
//
////    override val portalRenderer: Portal.Renderer = object : Portal.Renderer {
////        override fun accept(model: Portal.Source.Model) {
////            if (model is Portal.Source.Model.Showing) {
////                model.node.attachToView(androidView)
////            }
////        }
////    }
//
////    override fun accept(vm: RootView.ViewModel) {
////    }
//}
