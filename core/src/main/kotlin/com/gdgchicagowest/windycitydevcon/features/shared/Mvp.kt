package com.gdgchicagowest.windycitydevcon.features.shared

interface Mvp {

    interface View {

    }

    interface Presenter<T> {
        fun onAttach(view: T)
        fun onDetach()
    }
}