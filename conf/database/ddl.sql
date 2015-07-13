create database closeness_centrality;

create table vertex (
    id integer not null auto_increment,
    name varchar(50) not null,
    rank integer not null,
    primary key (id)
) engine=innodb;

create table edge (
    id integer not null auto_increment,
    source_vertex integer not null,
    target_vertex integer not null,
    primary key (id),
    foreign key (source_vertex) references vertex (id),
    foreign key (target_vertex) references vertex (id)
) engine=innodb;

create table path (
    id bigint not null auto_increment,
    source_vertex integer not null,
    target_vertex integer not null,
    distance decimal(8, 2) not null,
    description varchar(200) not null,
    primary key (id),
    foreign key (source_vertex) references vertex (id),
    foreign key (target_vertex) references vertex (id)
) engine=innodb;