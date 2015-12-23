FROM clojure
WORKDIR /usr/src/app/sicp
COPY sicp/project.clj /usr/src/app/sicp/
RUN lein deps
CMD ["lein", "run"]
