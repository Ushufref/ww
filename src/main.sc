require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: /hello
        q!: [* *ривет* */* *дравствуй* */* *обр* * (~день/~вечер/~утро) ]
        a: sap
        
    state: /weather
        q!: [* *огод* */* *рогноз* */ * *радус* *]
        a: nice
    
    


    state: /NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

